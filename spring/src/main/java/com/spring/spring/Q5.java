package com.spring.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



//(5) Demonstrate how you will resolve ambiguity while autowiring bean (Hint : @Primary)
interface employee{
    public void workstatus();
}
//@Component
class employee1 implements employee{
    @Override
    public void workstatus()
    {
        System.out.println("Employee 1 currently Working");
    }
}
//@Component
//@Primary
class employee2 implements employee{
    @Override
    public void workstatus()
    {
        System.out.println("Employee 2 currently Working");
    }
}
//@Component
public class Q5 {
   // @Autowired
    private emp e;

    public Q5(emp e) {
        this.e = e;
    }
    public void worker()
    {
        e.workstatus();
    }
}
