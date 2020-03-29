package com.JPA3.JPA3.Repository;

import com.JPA3.JPA3.Entity.Author;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface AuthorRepository extends PagingAndSortingRepository<Author, Integer> {
}
