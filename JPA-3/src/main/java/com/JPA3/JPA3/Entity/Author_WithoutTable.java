package com.JPA3.JPA3.Entity;

import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Author_WithoutTable {
    @Id
    @GeneratedValue
    private Integer id;
    private String authorName;
    @OneToMany(mappedBy = "Author",cascade = CascadeType.ALL)
    private Set<Book_WithoutTable> book_withoutTables;

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

    public Set<Book_WithoutTable> getBook_withoutTables() {
        return book_withoutTables;
    }

    public void setBook_withoutTables(Set<Book_WithoutTable> book_withoutTables) {
        this.book_withoutTables = book_withoutTables;
    }
}
