package com.Bootcamp2020Project.Project.Entities.Product;

import com.Bootcamp2020Project.Project.Entities.Order.Order_Status;
import com.Bootcamp2020Project.Project.Entities.User.User_Seller;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer productId;
    @ManyToOne
    @JoinColumn(name = "Seller")
    @MapsId
    private User_Seller user_seller;
    private String productName;
    private String productDesc;
    private boolean isCancellable;
    private boolean isReturnable;
    private boolean isActive;
    private String Brand;
    @ManyToOne
    @JoinColumn(name = "Category")
    private Product_Category product_category;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Product_Review> product_reviews;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Product_Variation> product_variations;

    @OneToOne(cascade = CascadeType.ALL)
    private Order_Status order_status;

    public Order_Status getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Order_Status order_status) {
        this.order_status = order_status;
    }

    public Set<Product_Variation> getProduct_variations() {
        return product_variations;
    }

    public void setProduct_variations(Set<Product_Variation> product_variations) {
        this.product_variations = product_variations;
    }

    public Set<Product_Review> getProduct_reviews() {
        return product_reviews;
    }

    public void setProduct_reviews(Set<Product_Review> product_reviews) {
        this.product_reviews = product_reviews;
    }

    public Product_Category getProduct_category() {
        return product_category;
    }

    public void setProduct_category(Product_Category product_category) {
        this.product_category = product_category;
    }

    public User_Seller getUser_seller() {
        return user_seller;
    }

    public void setUser_seller(User_Seller user_seller) {
        this.user_seller = user_seller;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public boolean isCancellable() {
        return isCancellable;
    }

    public void setCancellable(boolean cancellable) {
        isCancellable = cancellable;
    }

    public boolean isReturnable() {
        return isReturnable;
    }

    public void setReturnable(boolean returnable) {
        isReturnable = returnable;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }
}
