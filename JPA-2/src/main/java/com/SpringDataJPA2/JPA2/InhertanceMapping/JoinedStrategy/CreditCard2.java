package com.SpringDataJPA2.JPA2.InhertanceMapping.JoinedStrategy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "card2")
@PrimaryKeyJoinColumn(name = "id")
public class CreditCard2 extends Payment2 {
    @Id
    private Integer id;
    private String cardnumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }
}
