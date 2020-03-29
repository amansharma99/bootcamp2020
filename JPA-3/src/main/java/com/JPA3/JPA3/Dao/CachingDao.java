package com.JPA3.JPA3.Dao;

import com.JPA3.JPA3.Entity.Caching;
import com.JPA3.JPA3.Repository.CachingRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.Optional;
@Component
public class CachingDao {
    @Autowired
    CachingRepository cachingRepository;
    @Autowired
    EntityManager entityManager;
    public void create()
    {
        Caching caching=new Caching();
        caching.setId(1);
        caching.setName("ABC");
        Caching caching1=new Caching();
        caching1.setId(2);
        caching1.setName("DEF");
        cachingRepository.save(caching);
        cachingRepository.save(caching1);
        Session session=entityManager.unwrap(Session.class);
    }
    public void evict()
    {
        Caching caching=null;
        Optional<Caching> caching1=cachingRepository.findById(1);
        if(caching1.isPresent())
            caching=caching1.get();
        cachingRepository.findById(1);
        cachingRepository.findById(1);
        Session session=entityManager.unwrap(Session.class);
        session.evict(caching);
        cachingRepository.findById(1);
    }
}
