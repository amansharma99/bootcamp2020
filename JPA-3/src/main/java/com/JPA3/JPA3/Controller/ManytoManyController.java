package com.JPA3.JPA3.Controller;

import com.JPA3.JPA3.Dao.Author_Book_ManytoManyDao;
import com.JPA3.JPA3.Entity.Author_ManytoMany;
import com.JPA3.JPA3.Repository.ManytoManyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManytoManyController {
    @Autowired
    private Author_Book_ManytoManyDao author_book_manytoManyDao;
    @GetMapping("/ManytoMany")
    public String createauthor()
    {
        author_book_manytoManyDao.createauhtor();
        return "Relation between author and book is manytomany";
    }

}
