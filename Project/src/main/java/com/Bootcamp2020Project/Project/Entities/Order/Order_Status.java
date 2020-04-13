package com.Bootcamp2020Project.Project.Entities.Order;

import com.Bootcamp2020Project.Project.Entities.Product.Product;
import com.Bootcamp2020Project.Project.Entities.Product.Product_Variation;

import javax.persistence.*;

@Entity
public class Order_Status {
    @Id
    private Integer id;
    private String From_Status;
    private String To_Status;
    private String transaction_Comment;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ProductId")
    @MapsId
private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getFrom_Status() {
        return From_Status;
    }

    public void setFrom_Status(String from_Status) {
        From_Status = from_Status;
    }

    public String getTo_Status() {
        return To_Status;
    }

    public void setTo_Status(String to_Status) {
        To_Status = to_Status;
    }

    public String getTransaction_Comment() {
        return transaction_Comment;
    }

    public void setTransaction_Comment(String transaction_Comment) {
        this.transaction_Comment = transaction_Comment;
    }
}
