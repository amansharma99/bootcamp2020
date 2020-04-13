package com.Bootcamp2020Project.Project.Entities.Order;

import javax.persistence.*;

enum FROM_STATUS
{
    ORDER_PLACED,
    CANCELLED,
    ORDER_REJECTED,
    ORDER_CONFIRMED,
    ORDER_SHIPPED,
    DELIVERED,
    RETURN_REQUESTED,
    RETURN_REJECTED,
    RETURN_APPROVED,
    PICK_UP_INITIATED,
    PICK_UP_COMPLETED,
    REFUND_INITIATED,
    REFUND_COMPLETED
}
enum TO_STATUS
{
    CANCELLED,
    ORDER_CONFIRMED,
    ORDER_REJECTED,
    REFUND_INITIATED,
    CLOSED,
    ORDER_SHIPPED,
    DELIVERED,
    RETURN_REQUESTED,
    RETURN_REJECTED,
    RETURN_APPROVE,
    PICK_UP_INITIATED,
    PICK_UP_COMPLETED,

    REFUND_COMPLETED,

}@Entity
@Table(name = "ORDER_STATUS")
class OrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "TRANSITION_NOTES_COMMENTS")
    private String transition_notes_comments;
    @OneToOne
    @JoinColumn(name = "ORDER_PRODUCT_ID")
    private Ordered_Product orderProduct;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ordered_Product getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(Ordered_Product orderProduct) {
        this.orderProduct = orderProduct;
    }

    public String getTransition_notes_comments() {
        return transition_notes_comments;
    }

    public void setTransition_notes_comments(String transition_notes_comments) {
        this.transition_notes_comments = transition_notes_comments;
    }
}
