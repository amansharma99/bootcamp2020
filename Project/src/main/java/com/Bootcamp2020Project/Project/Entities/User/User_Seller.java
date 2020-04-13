package com.Bootcamp2020Project.Project.Entities.User;

import com.Bootcamp2020Project.Project.Entities.Product.Product;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User_Seller {
    @Id
    private Integer id;
    @OneToOne
    @JoinColumn
    @MapsId
    private User userId;
    private Float GST;
    private Double companyContact;
    private String companyName;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Product> products;

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Float getGST() {
        return GST;
    }

    public void setGST(Float GST) {
        this.GST = GST;
    }

    public Double getCompanyContact() {
        return companyContact;
    }

    public void setCompanyContact(Double companyContact) {
        this.companyContact = companyContact;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
