package com.JPA3.JPA3.Controller;

import com.JPA3.JPA3.Dao.WithoutTableDao;
import com.JPA3.JPA3.Entity.Author_WithoutTable;
import com.JPA3.JPA3.Repository.WithoutTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@RestController
public class WithoutTableController {
    @Autowired
    WithoutTableDao withoutTableDao;
    @Autowired
    WithoutTableRepository withoutTableRepository;
    @GetMapping("/WithoutAnyTable")
    public String create()
    {
        Author_WithoutTable author_withoutTable=withoutTableDao.create();
        withoutTableRepository.save(author_withoutTable);
        return "Task Completed";
    }
}
