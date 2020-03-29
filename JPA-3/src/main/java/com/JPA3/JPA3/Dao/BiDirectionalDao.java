package com.JPA3.JPA3.Dao;

import com.JPA3.JPA3.Entity.Author_BiDirectional;
import com.JPA3.JPA3.Entity.Book_BiDirectional;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class BiDirectionalDao {
    public Author_BiDirectional create()
    {
        Author_BiDirectional author_biDirectional=new Author_BiDirectional();
        author_biDirectional.setAuthorname("Aman");
        Book_BiDirectional book_biDirectional=new Book_BiDirectional();
        book_biDirectional.setBookName("ABC");
        Book_BiDirectional book_biDirectional1=new Book_BiDirectional();
        book_biDirectional1.setBookName("DEF");
        HashSet<Book_BiDirectional> book_biDirectionalHashSet=new HashSet<>();
        book_biDirectionalHashSet.add(book_biDirectional);
        book_biDirectionalHashSet.add(book_biDirectional1);
        author_biDirectional.setBook_biDirectionals(book_biDirectionalHashSet);
        return author_biDirectional;
    }
}
