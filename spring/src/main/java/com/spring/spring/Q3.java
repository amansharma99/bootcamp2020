package com.spring.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//(3) Use @Compenent and @Autowired annotations to in Loosely Coupled code for dependency management
interface emp{
    public void workstatus();
}
//@Component
class emp1 implements emp{
    @Override
    public void workstatus()
    {
        System.out.println("Employee currently Working");
    }
}
//@Component
public class Q3 {
    //@Autowired
    private emp e;
    public  Q3(){
        System.out.println("Q3");
    }
    public Q3(emp e) {
        this.e = e;
    }
    public void worker()
    {
        e.workstatus();
    }
}
