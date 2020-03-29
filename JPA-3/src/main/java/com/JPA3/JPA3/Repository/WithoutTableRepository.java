package com.JPA3.JPA3.Repository;

import com.JPA3.JPA3.Entity.Author_WithoutTable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface WithoutTableRepository extends PagingAndSortingRepository<Author_WithoutTable,Integer> {
}
