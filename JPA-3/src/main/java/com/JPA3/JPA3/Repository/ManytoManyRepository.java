package com.JPA3.JPA3.Repository;

import com.JPA3.JPA3.Entity.Author_ManytoMany;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ManytoManyRepository extends PagingAndSortingRepository<Author_ManytoMany,Integer> {
}
