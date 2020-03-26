package com.SpringDataJPA2.JPA2.InhertanceMapping.TablePerClassStrategy;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bankcheck")
public class Check1 extends Payment1{
    private String checknumber;

    public String getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(String checknumber) {
        this.checknumber = checknumber;
    }
}
