package com.Bootcamp2020Project.Project.Services;

import com.Bootcamp2020Project.Project.Dto.AdminSellerDto;
import com.Bootcamp2020Project.Project.Dto.PasswordDto;
import com.Bootcamp2020Project.Project.Dto.SellerDto;
import com.Bootcamp2020Project.Project.Dto.SellerProfileDto;
import com.Bootcamp2020Project.Project.Entities.User.Address;
import com.Bootcamp2020Project.Project.Entities.User.Seller;
import com.Bootcamp2020Project.Project.Exceptions.ConfirmPasswordException;
import com.Bootcamp2020Project.Project.Exceptions.EmailAlreadyExistsException;
import com.Bootcamp2020Project.Project.Repositories.AddressRepository;
import com.Bootcamp2020Project.Project.Repositories.SellerRepository;
import com.Bootcamp2020Project.Project.Repositories.UserRepository;
import com.Bootcamp2020Project.Project.security.AppUser;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class SellerService {

    @Autowired
    SellerRepository sellerRepository;

    @Autowired
    UserRepository userRepository;

    PasswordEncoder passwordEncoder;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    EmailService emailService;

    //to Get the Current Logged-In Username in Spring Security
    public Seller getLoggedInSeller() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        AppUser userDetail = (AppUser) authentication.getPrincipal();
        String username = userDetail.getUsername();
        Seller seller = sellerRepository.findByUsername(username);
        return seller;
    }

    public String addseller(Seller user) {
        System.out.println(user.getPassword());
        String password=user.getPassword();
        if (userRepository.findByUsername(user.getEmail())==null){
            String confirmPassword=user.getConfirmPassword();
            if(password.equals(confirmPassword)) {
                user.setPassword(passwordEncoder.encode(password));
                emailService.sendEmail("ACCOUNT ACTIVATION APPROVAL", "Hii, \n Your email "+user.getEmail()
                                +" have been successfully registered, but you have to wait for a successful approval by our Executive-Officer. ",
                        user.getEmail());

                emailService.sendEmail("ACCOUNT ACTIVATION APPROVAL", "Hii Admin,\n You have a pending task, user " + user.getEmail()
                                + " have been successfully registered, but it needs your approval. To activate " + user.getEmail()
                                + " click here -> http://localhost:8080/activate-user/" + user.getEmail(),
                        "ayush9005716605@gmail.com");
                sellerRepository.save(user);
                return "Check your email for further registration process.";
            }
            else
                throw  new ConfirmPasswordException("Password & Confirm-Password doesn't match");
        }
        else
            throw new EmailAlreadyExistsException("Email "+user.getEmail()+" is already registered");
    }

    public List<Seller> listAllSeller(){
        return sellerRepository.findAllSeller(PageRequest.of(0,10, Sort.Direction.ASC,"user_id"));
    }

    @Transactional
    public void editSeller(SellerDto seller1){
        Seller seller=getLoggedInSeller();
        if(seller1.getFirstName()==null)
            seller1.setFirstName(seller.getFirstName());
        if(seller1.getMiddleName()==null)
            seller1.setMiddleName(seller.getMiddleName());
        if(seller1.getLastName()==null)
            seller1.setLastName(seller.getLastName());
        if(seller1.getGST()==null)
            seller1.setGST(seller.getGST());
        if(seller1.getCompanyName()==null)
            seller1.setCompanyName(seller.getCompanyName());
        if(seller1.getCompanyContact()==null)
            seller1.setCompanyContact(seller.getCompanyContact());

        sellerRepository.updateSeller(seller.getId(),seller1.getFirstName(),
                seller1.getMiddleName(), seller1.getLastName(),seller1.getGST(),
                seller1.getCompanyName(),seller1.getCompanyContact());
    }

    public SellerProfileDto myProfile() {
        Seller seller=getLoggedInSeller();
        Address address = addressRepository.findAddressBySeller(seller.getId());
        SellerProfileDto sellerDto=new SellerProfileDto(seller.getId(),seller.getFirstName(),seller.getMiddleName(),
                seller.getLastName(),seller.getGST(),seller.getCompanyContact(),seller.getCompanyName(),
                address.getCity(),address.getState(),address.getCountry(),address.getZipCode());
        return sellerDto;
    }

    @Transactional
    public void updatePassword(PasswordDto password) {
        Seller seller = getLoggedInSeller();
        String password1 = password.getPassword();
        String confirmPassword = password.getConfirmpassword();
        if (password1.equals(confirmPassword)) {
            seller.setPassword(passwordEncoder.encode(password1));
            sellerRepository.save(seller);
        }
        else
            throw new ConfirmPasswordException("password didn't matched");
    }
}
