package com.JPA3.JPA3.Entity;



import javax.persistence.*;

@Entity
@Table(name = "Book_UniDirectional")
public class Book_UniDirectional {
    @Id
    private Integer id;
    private String bookName;

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
