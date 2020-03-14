  package com.SpringRestFulPart2.SpringRestFulPart2;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
//import org.springframework.hateoas.server.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.core.ControllerEntityLinks;
import org.springframework.hateoas.server.core.ControllerEntityLinksFactoryBean;
import org.springframework.hateoas.server.mvc.ControllerLinkBuilder;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
//import sun.misc.Resource;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

import static org.springframework.hateoas.server.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.ControllerLinkBuilder.methodOn;

  @RestController
public class Controller {
    @Autowired
    private Service s;
    @Autowired private MessageSource messageSource;
    @GetMapping("/{name}")
    public String Message(@RequestHeader (name="Accept-Language",required =false) Locale locale,@PathVariable String name)
    {
        return String.format(messageSource.getMessage("Hello.User.message", null,locale)+" %s",name);
    }

    @GetMapping("")
    public String Welcome() {
        return "Welcome To RestFul Web Services";
    }

    @GetMapping("/User/{id}")
    public EntityModel<User> GetUser(@PathVariable int id) {
        User u = s.getUser(id);
        if (u == null) {
            throw new UserNotFoundException("ID:"+id);
        }
        EntityModel<User> userEntityModel=new EntityModel<User>(u);
        ControllerLinkBuilder controllerLinkBuilder=linkTo(methodOn(this.getClass()).allusers());
        userEntityModel.add(controllerLinkBuilder.withRel("ALL Users"));
        return  userEntityModel;
    }

    @GetMapping("/Users")
    public List<User> allusers(){return   s.allUsers();}

    @PostMapping("/AddUser/StaticFilter")
    public User Adduser(@Valid @RequestBody User u) {return s.addUser(u);}

    @DeleteMapping("/DeleteUser/{id}")
    public List<User> Deleteuser(@PathVariable int id)
    {
        User u=s.deleteUser(id);
        if(u==null)
            throw new UserNotFoundException("Id:"+id);
        return s.allUsers();
    }
    @PostMapping("/AddUser/DynamicFilter")
    public MappingJacksonValue dynamic(@Valid @RequestBody User u)
    {
        s.addUser(u);
        SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("id","name","age");
        FilterProvider filters=new SimpleFilterProvider().addFilter("DynamicFilter",filter);
        MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(u);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }

    @PutMapping("/UpdateUser/{id}")
    public User update(@PathVariable int id , @Valid @RequestBody User u)
    {
        return s.updateUser(id,u);
    }
}
