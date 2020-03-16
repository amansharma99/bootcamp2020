package com.SpringDataJPApart1.SpringDataJPApart1.Repository;

import com.SpringDataJPApart1.SpringDataJPApart1.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
//(2) Set up EmployeeRepository with Spring Data JPA
public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Long> {
    List<Employee> findByName(String name);
    default Employee findOne(Long id)
    {
        return findById(id).orElse(null);
    }
    List<Employee> findByNameLike(String name);
    List<Employee> findByAgeBetween(Integer age1,Integer age2);
}
