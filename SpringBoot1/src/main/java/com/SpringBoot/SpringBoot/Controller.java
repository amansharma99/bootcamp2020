package com.SpringBoot.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class Controller  {
    @Autowired
    private Services s;

    //Question1:Create a simple REST ful service in Spring Boot which returns the Response "Welcome to spring boot".
    @GetMapping("")
    public String springboot() { return "Welcome to SpringBoot"; }

    //Question3:Implement GET http request for Employee to get list of employees.
    @GetMapping("/Employees")
    public List<Employees> Emloyees() {return s.Allemp();}

    //Question4:Implement GET http request using path variable top get one employee
    @GetMapping("/Employee/{id}")
    public Employees Employee(@PathVariable int id) {
       Employees x=s.getemp(id);
       if(x==null)
        {throw new UserNotFoundException("Id:"+id);}
        return x;
    }

    //Question5:Implement POST http request for Employee to create a new employee
    @PostMapping("/AddEmployee")
    public void addEmployee(@Valid @RequestBody Employees e) { s.addemp(e); }

    //Question7:Implement DELETE http request for Employee to delete employee
    @DeleteMapping("/DeleteEmployee/{id}")
    public List<Employees> deluser(@PathVariable int id)
    {
        Employees e=s.delemp(id);
        if(e==null)
            throw new UserNotFoundException("ID:"+id);
         return s.Allemp();
    }

    //Question8:Implement PUT http request for Employee to update employee
    @PutMapping("/UpdateEmployee/{id}")
    public Employees update(@PathVariable int id,@RequestBody Employees e)
    {
        return s.updatemp(id,e);
    }
}
