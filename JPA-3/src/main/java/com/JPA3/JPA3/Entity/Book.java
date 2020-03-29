package com.JPA3.JPA3.Entity;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    private Integer id;
    private String bookName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private Author Author;

    public com.JPA3.JPA3.Entity.Author getAuthor() {
        return Author;
    }

    public void setAuthor(com.JPA3.JPA3.Entity.Author author) {
        Author = author;
    }

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
}
