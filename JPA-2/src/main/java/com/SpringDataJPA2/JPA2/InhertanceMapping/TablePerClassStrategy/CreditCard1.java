package com.SpringDataJPA2.JPA2.InhertanceMapping.TablePerClassStrategy;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class CreditCard1 extends Payment1{
    private String cardnumber;

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }
}
