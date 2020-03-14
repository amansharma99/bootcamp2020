package com.SpringRestFulPart2.SpringRestFulPart2.Versioning;

public class User1 {
    private Integer Id;
    private String name;
    private Integer age;
    private String Address;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public User1(Integer id, String name, Integer age, String address) {
        Id = id;
        this.name = name;
        this.age = age;
        Address = address;
    }

    public User1(Integer id, String name) {
        Id = id;
        this.name = name;
    }
}
