package com.Bootcamp2020Project.Project.Entities.Product;

import com.Bootcamp2020Project.Project.Entities.User.User_Customer;

import javax.persistence.*;

@Entity
public class Product_Review {
    @Id
    private Integer id;
    private String productReview;
    private Integer productRating;
    @OneToOne
    @JoinColumn
    @MapsId
    private User_Customer UserReview;

    public User_Customer getUserReview() {
        return UserReview;
    }

    public void setUserReview(User_Customer userReview) {
        UserReview = userReview;
    }

    @ManyToOne
    @JoinColumn(name = "Review")
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getProductReview() {
        return productReview;
    }

    public void setProductReview(String productReview) {
        this.productReview = productReview;
    }

    public Integer getProductRating() {
        return productRating;
    }

    public void setProductRating(Integer productRating) {
        this.productRating = productRating;
    }
}
