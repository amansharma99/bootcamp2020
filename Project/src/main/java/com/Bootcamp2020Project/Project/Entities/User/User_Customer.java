package com.Bootcamp2020Project.Project.Entities.User;

import com.Bootcamp2020Project.Project.Entities.Order.Cart;
import com.Bootcamp2020Project.Project.Entities.Order.Order;
import com.Bootcamp2020Project.Project.Entities.Product.Product_Review;

import javax.persistence.*;
import java.net.UnknownServiceException;
import java.util.Set;

@Entity
public class User_Customer {
    @Id
    @GeneratedValue
    private Integer CustomerId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserId")
    private User userId;
    private Integer customerContact;
    @OneToOne(mappedBy = "UserReview",cascade = CascadeType.ALL)
    private Product_Review product_review;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Order> orders;
    @OneToOne(cascade = CascadeType.ALL)
    private Cart cart;

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Product_Review getProduct_review() {
        return product_review;
    }

    public void setProduct_review(Product_Review product_review) {
        this.product_review = product_review;
    }

    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer customerId) {
        CustomerId = customerId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Integer getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(Integer customerContact) {
        this.customerContact = customerContact;
    }
}
