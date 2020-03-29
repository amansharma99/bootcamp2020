package com.JPA3.JPA3.Entity;

import javax.persistence.Embeddable;


   // Create a class Address for Author with instance variables streetNumber, location, State.


@Embeddable
public class AuthorAddress {
    private Integer streetNumber;
    private String location;
    private String state;

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
