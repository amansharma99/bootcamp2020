package com.JPA3.JPA3.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


//Create instance variable of Address class inside Author class and save it as embedded object.


@Entity
@Table(name = "Author")
public class Author {
    @Id
    private Integer id;
    private String authorName;
    @Embedded
    private AuthorAddress authorAddress;
    @OneToMany(mappedBy = "Author",cascade = CascadeType.ALL)
    private Set<Subject> subjects;
    @OneToOne(mappedBy = "Author",cascade = CascadeType.ALL)
    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
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

    public AuthorAddress getAuthorAddress() {
        return authorAddress;
    }

    public void setAuthorAddress(AuthorAddress authorAddress) {
        this.authorAddress = authorAddress;
    }
    public void addSubject(Subject subject) {
        if (subject != null) {
            if (subjects == null)
                subjects = new HashSet<>();
            subject.setAuthor(this);
            subjects.add(subject);
        }
    }
}
