package com.JPA3.JPA3.Controller;

import com.JPA3.JPA3.Dao.UniDirectioanlDao;
import com.JPA3.JPA3.Entity.Author_UniDirectional;
import com.JPA3.JPA3.Repository.UniDirectionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniDirectionalController {
    @Autowired
    UniDirectionalRepository uniDirectionalRepository;
    @Autowired
    UniDirectioanlDao uniDirectioanlDao;
    @GetMapping("/UniDirectional")
    public String create()
    {
        Author_UniDirectional author_uniDirectional=uniDirectioanlDao.create();
        uniDirectionalRepository.save(author_uniDirectional);
        return "Uni-Directional relation has been established";
    }
}
