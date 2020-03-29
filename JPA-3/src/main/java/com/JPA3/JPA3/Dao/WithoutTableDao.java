package com.JPA3.JPA3.Dao;

import com.JPA3.JPA3.Entity.Author_WithoutTable;
import com.JPA3.JPA3.Entity.Book_BiDirectional;
import com.JPA3.JPA3.Entity.Book_WithoutTable;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class WithoutTableDao {
    public Author_WithoutTable create()
    {
        Author_WithoutTable author_withoutTable = new Author_WithoutTable();
        author_withoutTable.setAuthorName("Aman");
        Book_WithoutTable book_withoutTable=new Book_WithoutTable();
        book_withoutTable.setBookName("ABC");
        Book_WithoutTable book_withoutTable1=new Book_WithoutTable();
        book_withoutTable1.setBookName("DEF");
        HashSet<Book_WithoutTable> book_withoutTableHashSet=new HashSet<>();
        book_withoutTableHashSet.add(book_withoutTable);
        book_withoutTableHashSet.add(book_withoutTable1);
        book_withoutTable.setAuthor(author_withoutTable);
        book_withoutTable1.setAuthor(author_withoutTable);
        author_withoutTable.setBook_withoutTables(book_withoutTableHashSet);
        return author_withoutTable;

    }
}
