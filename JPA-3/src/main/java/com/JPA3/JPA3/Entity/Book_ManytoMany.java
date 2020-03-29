package com.JPA3.JPA3.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Book_ManytoMany {
    @Id
    private Integer id;
    private String bookName;
    @ManyToMany(mappedBy = "book_manytoManySet",cascade = CascadeType.ALL)
    Set<Author_ManytoMany> author_manytoManySet;

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

    public Set<Author_ManytoMany> getAuthor_manytoManySet() {
        return author_manytoManySet;
    }

    public void setAuthor_manytoManySet(Set<Author_ManytoMany> author_manytoManySet) {
        this.author_manytoManySet = author_manytoManySet;
    }
}
