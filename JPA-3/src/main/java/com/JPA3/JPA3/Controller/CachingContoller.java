package com.JPA3.JPA3.Controller;

import com.JPA3.JPA3.Dao.CachingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CachingContoller {
    @Autowired
    CachingDao cachingDao;
    @GetMapping("/Caching")
    public String caching()
    {
        cachingDao.create();
        return "Caching Done";
    }
    @GetMapping("/Evict")
    public String evict()
    {
        cachingDao.evict();
        return "Evict Done";
    }
}
