package com.spring.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//(4) Get a Spring Bean from application context and display its properties.
//@Component
public class Q4 {
    private String name="Aman";
    private int id=1;

    public Q4(){
        System.out.println("This is Q4 class");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Q4(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void show()
    {
        System.out.println("Id: "+id+" Name: "+name);
    }
}

