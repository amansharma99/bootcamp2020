package com.JPA3.JPA3.Entity;

import javax.persistence.*;

@Entity
public class Book_WithoutTable {
    @Id
    @GeneratedValue
    private Integer id;
    private String bookName;
    @ManyToOne
    @JoinColumn(name = "Author_Book")
    private Author_WithoutTable Author;

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

    public Author_WithoutTable getAuthor() {
        return Author;
    }

    public void setAuthor(Author_WithoutTable author) {
        Author = author;
    }
}
