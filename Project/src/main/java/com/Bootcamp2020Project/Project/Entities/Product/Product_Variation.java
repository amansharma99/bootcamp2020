package com.Bootcamp2020Project.Project.Entities.Product;

import com.Bootcamp2020Project.Project.Entities.Order.Cart;
import com.Bootcamp2020Project.Project.Entities.Order.Order_Status;
import com.Bootcamp2020Project.Project.Entities.Order.Ordered_Product;

import javax.persistence.*;

@Entity
public class Product_Variation {
    @Id
    private Integer id;
    private Integer quantityAvailable;
    private Double price;
    private String metadata;
    private String Image;
    @ManyToOne
    @JoinColumn(name = "Product")
    @MapsId
    private Product product;
    @OneToOne(cascade = CascadeType.ALL)
    private Ordered_Product ordered_product;
    @OneToOne(cascade = CascadeType.ALL)
    private Cart cart;

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Ordered_Product getOrdered_product() {
        return ordered_product;
    }

    public void setOrdered_product(Ordered_Product ordered_product) {
        this.ordered_product = ordered_product;
    }

    public Integer getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(Integer quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
