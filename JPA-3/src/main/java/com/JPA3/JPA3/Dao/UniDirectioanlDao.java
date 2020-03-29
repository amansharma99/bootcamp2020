package com.JPA3.JPA3.Dao;

import com.JPA3.JPA3.Entity.Author_UniDirectional;
import com.JPA3.JPA3.Entity.Book_UniDirectional;
import com.JPA3.JPA3.Repository.UniDirectionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class UniDirectioanlDao {

    public Author_UniDirectional create()
    {
        Author_UniDirectional author_uniDirectional=new Author_UniDirectional();
        author_uniDirectional.setId(1);
        author_uniDirectional.setAuthorName("Aman");
        Book_UniDirectional book_uniDirectional=new Book_UniDirectional();
        book_uniDirectional.setId(1);
        book_uniDirectional.setBookName("XYZ");
        Book_UniDirectional book_uniDirectional1=new Book_UniDirectional();
        book_uniDirectional1.setId(2);
        book_uniDirectional1.setBookName("ABC");
        Set<Book_UniDirectional> book_uniDirectionalHashSet=new HashSet<>();
        book_uniDirectionalHashSet.add(book_uniDirectional);
        book_uniDirectionalHashSet.add(book_uniDirectional1);
        author_uniDirectional.setBook_UniDirectionals(book_uniDirectionalHashSet);
        return author_uniDirectional;
    }
}
