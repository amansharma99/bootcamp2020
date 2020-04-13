package com.Bootcamp2020Project.Project.Entities.User;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer userId;
    private String userEmail;
    private String firstName;
    private String middleName;
    private String lastName;
    private String userPassword;
    private Boolean isDeleted;
    private boolean isActive;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<User_Address> user_address;
    @OneToOne(mappedBy = "userId",cascade = CascadeType.ALL)
    private User_Customer user_customer;
    @OneToOne(mappedBy = "roleId",cascade = CascadeType.ALL)
    private User_Role user_role;
    @OneToOne(mappedBy = "userId",cascade = CascadeType.ALL)
    private User_Seller user_seller;

    public User_Seller getUser_seller() {
        return user_seller;
    }

    public void setUser_seller(User_Seller user_seller) {
        this.user_seller = user_seller;
    }

    public User_Role getUser_role() {
        return user_role;
    }

    public void setUser_role(User_Role user_role) {
        this.user_role = user_role;
    }

    public User_Customer getUser_customer() {
        return user_customer;
    }

    public void setUser_customer(User_Customer user_customer) {
        this.user_customer = user_customer;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Set<User_Address> getUser_address() {
        return user_address;
    }

    public void setUser_address(Set<User_Address> user_address) {
        this.user_address = user_address;
    }
}
