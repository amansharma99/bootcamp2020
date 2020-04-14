package com.Bootcamp2020Project.Project.Entities.Order;

import com.Bootcamp2020Project.Project.Entities.Product.ProductVariation;

import javax.persistence.*;

@Entity
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer quantity;

    private Double price;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OrderId")
    private Orders orders;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ProductVariationId")
    private ProductVariation productVariation;
    @OneToOne(mappedBy = "orderProduct")
    private OrderStatus orderStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public ProductVariation getProductVariation() {
        return productVariation;
    }

    public void setProductVariation(ProductVariation productVariation) {
        this.productVariation = productVariation;
    }
}