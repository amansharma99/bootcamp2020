package com.JPA3.JPA3.Controller;

import com.JPA3.JPA3.Dao.BiDirectionalDao;
import com.JPA3.JPA3.Entity.Author_BiDirectional;
import com.JPA3.JPA3.Repository.BiDirectionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuDirectionalController {
    @Autowired
    BiDirectionalRepository biDirectionalRepository;
    @Autowired
    BiDirectionalDao biDirectionalDao;
    @GetMapping("/BiDirectional")
    public String create()
    {
        Author_BiDirectional author_biDirectional=biDirectionalDao.create();
        biDirectionalRepository.save(author_biDirectional);
        return "BiDirectioanl Relation has been established";
    }
}
