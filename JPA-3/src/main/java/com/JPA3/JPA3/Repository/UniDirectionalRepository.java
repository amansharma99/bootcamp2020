package com.JPA3.JPA3.Repository;

import com.JPA3.JPA3.Entity.Author_UniDirectional;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UniDirectionalRepository extends PagingAndSortingRepository<Author_UniDirectional,Integer> {
}
