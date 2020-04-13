package com.Bootcamp2020Project.Project.Entities.Order;

import com.Bootcamp2020Project.Project.Entities.Product.Product_Variation;

import javax.persistence.*;

@Entity
public class Ordered_Product {
    @Id
    private Integer id;
    private Integer Quantity;
    private Double price;
    private String productVariationMeteData;
    @OneToOne
    @JoinColumn
    @MapsId
    private Order order;
    @OneToOne
    @JoinColumn
    private Product_Variation product_variation;

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProductVariationMeteData() {
        return productVariationMeteData;
    }

    public void setProductVariationMeteData(String productVariationMeteData) {
        this.productVariationMeteData = productVariationMeteData;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product_Variation getProduct_variation() {
        return product_variation;
    }

    public void setProduct_variation(Product_Variation product_variation) {
        this.product_variation = product_variation;
    }
}
