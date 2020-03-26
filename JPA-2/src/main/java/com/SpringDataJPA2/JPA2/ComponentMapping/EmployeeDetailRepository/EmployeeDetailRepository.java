package com.SpringDataJPA2.JPA2.ComponentMapping.EmployeeDetailRepository;

import com.SpringDataJPA2.JPA2.ComponentMapping.EmployeeDetail;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeDetailRepository extends PagingAndSortingRepository<EmployeeDetail,Integer> {
}
