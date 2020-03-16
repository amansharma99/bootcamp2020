package com.SpringDataJPApart1.SpringDataJPApart1;

import com.SpringDataJPApart1.SpringDataJPApart1.Repository.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class SpringDataJpApart1ApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
//	(3) Perform Create Operation on Entity using Spring Data JPA
	@Test
	void test_create_employee() {
		Employee employee=new Employee();
		employee.setId(1l);
		employee.setAge(20);
		employee.setName("Aman");
		employee.setLocation("East Delhi");
		employeeRepository.save(employee);

		Employee employee1=new Employee();
		employee1.setId(2l);
		employee1.setAge(19);
		employee1.setName("Shaishav");
		employee1.setLocation("West Delhi");
		employeeRepository.save(employee1);

		Employee employee2=new Employee();
		employee2.setId(3l);
		employee2.setAge(22);
		employee2.setName("Manish");
		employee2.setLocation("South Delhi");
		employeeRepository.save(employee2);

		Employee employee3=new Employee();
		employee3.setId(4l);
		employee3.setAge(30);
		employee3.setName("Harsh");
		employee3.setLocation("North Delhi");
		employeeRepository.save(employee3);
	}
//  (4) Perform Update Operation on Entity using Spring Data JPA
	@Test
	void test_update_employee()
	{
		Employee employee= employeeRepository.findOne(1l);
		employee.setName("Aman Sharma");
		employeeRepository.save(employee);
	}
//	(5) Perform Delete Operation on Entity using Spring Data JPA
	@Test
	void test_delete_employee()
	{
		employeeRepository.deleteById(2l);
	}
//  (5) Perform Read Operation on Entity using Spring Data JPA
	@Test
	void test_read_employee()
	{
		Employee findemployee= employeeRepository.findOne(1l);
		Assertions.assertNotNull(findemployee);
		Assertions.assertEquals("Aman",findemployee.getName());
	}
//	(6) Get the total count of the number of Employees
	@Test
	void test_countemployee()
	{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>Total Number os Employee are>>>>>>>>>>>>>>>>>>>>>"+ employeeRepository.count());
	}
//	(7) Implement Pagination and Sorting on the bases of Employee Age
	@Test
	void test_sortingemployee()
	{
		Pageable pageable=PageRequest.of(0,2,Sort.by("age"));
		Page<Employee> employeePage= employeeRepository.findAll(pageable);
		employeePage.forEach(e-> System.out.println(e.toString()));
	}
//  (8) Create and use finder to find Employee by Name
	@Test
	void test_findemployee_byage()
	{
		List<Employee> employeeList= employeeRepository.findByName("Aman");
		employeeList.forEach(e-> System.out.println(e));
	}
//	(9) Create and use finder to find Employees starting with A character
	@Test
	void test_findbynamelike()
	{
		List<Employee> employeeList= employeeRepository.findByNameLike("A%");
		employeeList.forEach(e-> System.out.println(e));
	}
//	(10) Create and use finder to find Employees Between the age of 28 to 32
	@Test
	void test_findbyagebetween28and32()
	{
		List<Employee> employeeList= employeeRepository.findByAgeBetween(28,32);
		employeeList.forEach(e-> System.out.println(e));
	}

}
