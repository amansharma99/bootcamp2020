package com.Bootcamp2020Project.Project.Entities.User;

import net.bytebuddy.asm.Advice;

import javax.persistence.*;

@Entity
public class User_Address {
    @Id
    @GeneratedValue
    private Integer userAddressId;
    private String userCity;
    private String userState;
    private String userCountry;
    private String userAddressLine;
    private Integer userZipCode;
    private String userLable;
    @ManyToOne
    @JoinColumn(name = "UserID")
    private User userId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserId")
    private User_Customer user_customer;

    public User_Customer getUser_customer() {
        return user_customer;
    }

    public void setUser_customer(User_Customer user_customer) {
        this.user_customer = user_customer;
    }

    public Integer getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(Integer userAddressId) {
        this.userAddressId = userAddressId;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public String getUserAddressLine() {
        return userAddressLine;
    }

    public void setUserAddressLine(String userAddressLine) {
        this.userAddressLine = userAddressLine;
    }

    public Integer getUserZipCode() {
        return userZipCode;
    }

    public void setUserZipCode(Integer userZipCode) {
        this.userZipCode = userZipCode;
    }

    public String getUserLable() {
        return userLable;
    }

    public void setUserLable(String userLable) {
        this.userLable = userLable;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}
