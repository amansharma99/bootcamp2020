package com.JPA3.JPA3.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Author_ManytoMany {
    @Id
    private Integer id;
    private String authorName;
    @ManyToMany(cascade = CascadeType.ALL)
            @JoinTable(name = "authors_books",joinColumns = @JoinColumn(name = "author_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "book_id",referencedColumnName = "id"))
    Set<Book_ManytoMany> book_manytoManySet;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Set<Book_ManytoMany> getBook_manytoManySet() {
        return book_manytoManySet;
    }

    public void setBook_manytoManySet(Set<Book_ManytoMany> book_manytoManySet) {
        this.book_manytoManySet = book_manytoManySet;
    }
}
