package com.SpringBoot.SpringBoot;

import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
//Question2:Create an Employee Bean(id, name, age) and service to  perform different operations related to employee.
public class Employees {
    @Length(max = 20,min = 2)
    private String e_name;
    @NotNull
    private Integer e_id;
    @Min(value = 18)  //Validation
    private Integer age;

    public Employees(String e_name, int e_id, int age) {
        this.e_name = e_name;
        this.e_id = e_id;
        this.age = age;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
