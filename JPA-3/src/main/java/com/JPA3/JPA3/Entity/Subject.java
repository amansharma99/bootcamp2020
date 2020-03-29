package com.JPA3.JPA3.Entity;

import javax.persistence.*;

@Entity
public class Subject {
    @Id
    private Integer id;
    private String subject;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id")
    private Author Author;

    public Author getAuthor() {
        return Author;
    }

    public void setAuthor(Author author) {
        this.Author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
