package com.SpringDataJPA2.JPA2.Entity;

import javax.persistence.*;

@Entity
@Table(name = "employeeTable")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empId")
    private Integer id;
    @Column(name="empFirstName")
    private String firstName;
    @Column(name="empLastName")
    private String lastName;
    @Column(name="empSalary")
    private Double salary;
    @Column(name="empAge")
    private Integer age;

    public Employee(Integer id, String firstName, String lastName, Double salary, Integer age) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}'+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<";
    }
    public Employee()
    {}
}
