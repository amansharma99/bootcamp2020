package com.JPA3.JPA3.Dao;

import com.JPA3.JPA3.Entity.Author;
import com.JPA3.JPA3.Entity.AuthorAddress;
import com.JPA3.JPA3.Entity.Book;
import com.JPA3.JPA3.Entity.Subject;
import org.springframework.stereotype.Component;

@Component
public class AuthorDao {
    public Author create_author()
    {
        Author author=new Author();
        author.setId(1);
        author.setAuthorName("Aman Sharma");
        AuthorAddress authorAddress=new AuthorAddress();
        authorAddress.setStreetNumber(3);
        authorAddress.setLocation("East Delhi");
        authorAddress.setState("Delhi");
        Subject subject=new Subject();
        subject.setId(1);
        subject.setSubject("HTML");
        subject.setAuthor(author);
        Subject subject1=new Subject();
        subject1.setId(2);
        subject1.setSubject("Java");
        subject1.setAuthor(author);
        Subject subject2=new Subject();
        subject2.setId(3);
        subject2.setSubject("Spring Boot");
        subject2.setAuthor(author);
        author.addSubject(subject);
        author.addSubject(subject1);
        author.addSubject(subject2);
        Book book=new Book();
        book.setId(1);
        book.setBookName("TOTHENEW");
        book.setAuthor(author);
        author.setBook(book);
        return author;
    }
}
