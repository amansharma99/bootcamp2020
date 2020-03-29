package com.JPA3.JPA3.Controller;

import com.JPA3.JPA3.Dao.AuthorDao;
import com.JPA3.JPA3.Entity.Author;
import com.JPA3.JPA3.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    AuthorDao authorDao;
    @GetMapping("/SaveAuthor")
    public String saveauthor()
    {
        Author author=authorDao.create_author();
        authorRepository.save(author);
        return "Author Saved";
    }
}
