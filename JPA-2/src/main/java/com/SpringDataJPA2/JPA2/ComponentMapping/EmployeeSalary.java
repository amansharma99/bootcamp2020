package com.SpringDataJPA2.JPA2.ComponentMapping;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeSalary {
    private Long basicSalary;
    private Long bonusSalary;
    private Long taxAmount;
    private Long specialAllowanceSalary;

    public Long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Long getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(Long bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public Long getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Long taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Long getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(Long specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }
}
