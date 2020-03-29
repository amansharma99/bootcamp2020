package com.JPA3.JPA3.Entity;

import javax.persistence.*;

@Entity
public class Book_BiDirectional {
    @Id
    @GeneratedValue
    private Integer id;
    private String bookName;
    @ManyToOne
    @JoinColumn(name = "Author_Book")
    private Author_BiDirectional author_biDirectional;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author_BiDirectional getAuthor_biDirectional() {
        return author_biDirectional;
    }

    public void setAuthor_biDirectional(Author_BiDirectional author_biDirectional) {
        this.author_biDirectional = author_biDirectional;
    }
}
