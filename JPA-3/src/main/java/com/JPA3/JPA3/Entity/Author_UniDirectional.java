package com.JPA3.JPA3.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Author_UniDirectional")
public class Author_UniDirectional {
    @Id
    private Integer id;
    private String authorName;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Book_UniDirectional> Book_UniDirectionals;

    public Set<Book_UniDirectional> getBook_UniDirectionals() {
        return Book_UniDirectionals;
    }

    public void setBook_UniDirectionals(Set<Book_UniDirectional> book_UniDirectionals) {
        this.Book_UniDirectionals = book_UniDirectionals;
    }

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


}
