package com.SpringDataJPA2.JPA2.InhertanceMapping.JoinedStrategy;

import javax.persistence.*;

@Entity
@Table(name = "Payment2")
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment2 {

    @Id
    private Integer id;
    private Double amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
