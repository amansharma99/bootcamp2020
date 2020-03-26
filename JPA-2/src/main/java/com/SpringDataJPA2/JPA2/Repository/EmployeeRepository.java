package com.SpringDataJPA2.JPA2.Repository;

import com.SpringDataJPA2.JPA2.Entity.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Integer> {
    @Query("select firstName,lastName from Employee where salary >(select AVG(salary) from Employee)")
    List<Object[]> findfirstNameAndlastName(Pageable pageable);

    @Query("select AVG(salary) from Employee")
    Double findAverageSalary();

    @Transactional
    @Query("update Employee set salary=:newsalary where salary<:avgsalary")
    @Modifying
    void updateSalary(@Param("newsalary") Double newsalary,@Param("avgsalary") Double avgsalary);

    @Query("select MIN(salary) from Employee")
    Double findMinimumSalary();

    @Transactional
    @Query("delete from Employee where salary=:minsalary")
    @Modifying
    void deleteEmployeeWheresalaryisMIN(@Param("minsalary") Double minsalary);

    @Query(value = "select empId,empFirstName,empAge from employeeTable where empLastName like '%Singh'",nativeQuery = true)
    List<Object[]> findAllEmployeehavinglastNameasSingh();

    @Transactional
    @Query(value = "delete from employeeTable where empAge=:empage",nativeQuery = true)
    @Modifying
    void deleteEmployeebyage(@Param("empage") Integer age);
}
