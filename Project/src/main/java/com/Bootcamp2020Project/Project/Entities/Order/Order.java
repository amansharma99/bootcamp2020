package com.Bootcamp2020Project.Project.Entities.Order;

import com.Bootcamp2020Project.Project.Entities.User.User_Address;
import com.Bootcamp2020Project.Project.Entities.User.User_Customer;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Order {
    @Id
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "CustomerID")
    @MapsId
    private User_Customer user_customer;
    private Double amountPaid;
    private Date orderedDate;
    private String paymentMethod;
    @OneToOne(cascade = CascadeType.ALL)
    private User_Address user_address;
    @OneToOne
    private Ordered_Product ordered_product;

    public Ordered_Product getOrdered_product() {
        return ordered_product;
    }

    public void setOrdered_product(Ordered_Product ordered_product) {
        this.ordered_product = ordered_product;
    }

    public User_Customer getUser_customer() {
        return user_customer;
    }

    public void setUser_customer(User_Customer user_customer) {
        this.user_customer = user_customer;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Date getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(Date orderedDate) {
        this.orderedDate = orderedDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public User_Address getUser_address() {
        return user_address;
    }

    public void setUser_address(User_Address user_address) {
        this.user_address = user_address;
    }
}
