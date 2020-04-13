package com.Bootcamp2020Project.Project.Entities.Order;

import com.Bootcamp2020Project.Project.Entities.Product.Product_Variation;
import com.Bootcamp2020Project.Project.Entities.User.User_Customer;

import javax.persistence.*;

@Entity
public class Cart {
    @Id
    private Integer id;
    private Integer Quantity;
    private boolean is_wishlist_item;
    @OneToOne
    @JoinColumn
    @MapsId
    private User_Customer user_customer;
    @OneToOne
    @JoinColumn
    private Product_Variation product_variation;

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public boolean isIs_wishlist_item() {
        return is_wishlist_item;
    }

    public void setIs_wishlist_item(boolean is_wishlist_item) {
        this.is_wishlist_item = is_wishlist_item;
    }

    public User_Customer getUser_customer() {
        return user_customer;
    }

    public void setUser_customer(User_Customer user_customer) {
        this.user_customer = user_customer;
    }

    public Product_Variation getProduct_variation() {
        return product_variation;
    }

    public void setProduct_variation(Product_Variation product_variation) {
        this.product_variation = product_variation;
    }
}
