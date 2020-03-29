package com.JPA3.JPA3.Dao;

import com.JPA3.JPA3.Entity.Author_ManytoMany;
import com.JPA3.JPA3.Entity.Book_ManytoMany;
import com.JPA3.JPA3.Repository.ManytoManyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;


@Component
public class Author_Book_ManytoManyDao {
    @Autowired
    private ManytoManyRepository manytoManyRepository;
    public void createauhtor()
    {
        Author_ManytoMany author_manytoMany=new Author_ManytoMany();
        author_manytoMany.setAuthorName("Aman");
        author_manytoMany.setId(1);
        Book_ManytoMany book_manytoMany=new Book_ManytoMany();
        book_manytoMany.setId(1);
        book_manytoMany.setBookName("ABCD");
        Book_ManytoMany book_manytoMany1=new Book_ManytoMany();
        book_manytoMany1.setId(2);
        book_manytoMany1.setBookName("EFGH");
        HashSet<Book_ManytoMany> book_manytoManyHashSet=new HashSet<>();
        book_manytoManyHashSet.add(book_manytoMany);
        book_manytoManyHashSet.add(book_manytoMany1);
        author_manytoMany.setBook_manytoManySet(book_manytoManyHashSet);
        Author_ManytoMany author_manytoMany1=new Author_ManytoMany();
        author_manytoMany1.setAuthorName("Ram");
        author_manytoMany1.setId(2);
        author_manytoMany1.setBook_manytoManySet(book_manytoManyHashSet);
        HashSet<Author_ManytoMany> author_manytoManyHashSet=new HashSet<>();
        author_manytoManyHashSet.add(author_manytoMany);
        author_manytoManyHashSet.add(author_manytoMany1);
        book_manytoMany.setAuthor_manytoManySet(author_manytoManyHashSet);
        manytoManyRepository.save(author_manytoMany);
        manytoManyRepository.save(author_manytoMany1);
    }
}
