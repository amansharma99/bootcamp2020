package com.SpringDataJPApart1.SpringDataJPApart1;

import javax.persistence.Entity;
import javax.persistence.Id;
//(1) Create an Employee Entity which contains following fields
@Entity
public class Employee {
    @Id
    private Long id;
    private String name;
    private Integer age;
    private String location;

    public Employee(Long id, String name, Integer age, String location) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee()
    {}

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }
}
