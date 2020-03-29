package com.JPA3.JPA3.Entity;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Set;

@Entity
public class Author_BiDirectional {
    @Id
    @GeneratedValue
    private Integer id;
    private String authorname;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Book_BiDirectional> book_biDirectionals;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public Set<Book_BiDirectional> getBook_biDirectionals() {
        return book_biDirectionals;
    }

    public void setBook_biDirectionals(Set<Book_BiDirectional> book_biDirectionals) {
        this.book_biDirectionals = book_biDirectionals;
    }
}
