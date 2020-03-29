package com.JPA3.JPA3.Repository;

import com.JPA3.JPA3.Entity.Author_BiDirectional;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BiDirectionalRepository extends PagingAndSortingRepository<Author_BiDirectional,Integer> {
}
