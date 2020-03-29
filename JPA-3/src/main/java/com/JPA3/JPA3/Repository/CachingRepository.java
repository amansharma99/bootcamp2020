package com.JPA3.JPA3.Repository;

import com.JPA3.JPA3.Entity.Caching;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CachingRepository extends PagingAndSortingRepository<Caching,Integer> {
}
