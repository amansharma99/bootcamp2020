package com.SpringDataJPA2.JPA2;

import com.SpringDataJPA2.JPA2.ComponentMapping.EmployeeDetail;
import com.SpringDataJPA2.JPA2.ComponentMapping.EmployeeDetailRepository.EmployeeDetailRepository;
import com.SpringDataJPA2.JPA2.ComponentMapping.EmployeeSalary;
import com.SpringDataJPA2.JPA2.Entity.Employee;
import com.SpringDataJPA2.JPA2.InhertanceMapping.JoinedStrategy.Check2;
import com.SpringDataJPA2.JPA2.InhertanceMapping.JoinedStrategy.CreditCard2;
import com.SpringDataJPA2.JPA2.InhertanceMapping.JoinedStrategy.Payment2Repository.Payment2Repository;
import com.SpringDataJPA2.JPA2.InhertanceMapping.SingleTableStrategy.Check;
import com.SpringDataJPA2.JPA2.InhertanceMapping.SingleTableStrategy.CreditCard;
import com.SpringDataJPA2.JPA2.InhertanceMapping.SingleTableStrategy.PaymentRepository.PaymentRepository;
import com.SpringDataJPA2.JPA2.InhertanceMapping.TablePerClassStrategy.Check1;
import com.SpringDataJPA2.JPA2.InhertanceMapping.TablePerClassStrategy.CreditCard1;
import com.SpringDataJPA2.JPA2.InhertanceMapping.TablePerClassStrategy.Payment1Repository.Payment1Repository;
import com.SpringDataJPA2.JPA2.Repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
class Jpa2ApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	PaymentRepository paymentRepository;
	@Autowired
	Payment1Repository payment1Repository;
	@Autowired
	Payment2Repository payment2Repository;
	@Autowired
	EmployeeDetailRepository employeeDetailRepository;
	@Test
	void test_create_employee() {
		Employee employee1=new Employee();
		employee1.setId(1);
		employee1.setFirstName("Aman");
		employee1.setLastName("Sharma");
		employee1.setAge(22);
		employee1.setSalary(16000d);
		employeeRepository.save(employee1);

		Employee employee2=new Employee();
		employee2.setId(2);
		employee2.setFirstName("Ram");
		employee2.setLastName("Kumar");
		employee2.setAge(22);
		employee2.setSalary(12000d);
		employeeRepository.save(employee2);

		Employee employee3=new Employee();
		employee3.setId(3);
		employee3.setFirstName("Sham");
		employee3.setLastName("Singh");
		employee3.setAge(22);
		employee3.setSalary(17000d);
		employeeRepository.save(employee3);

		Employee employee4=new Employee();
		employee4.setId(4);
		employee4.setFirstName("Manish");
		employee4.setLastName("Sani");
		employee4.setAge(22);
		employee4.setSalary(21000d);
		employeeRepository.save(employee4);

		Employee employee5=new Employee();
		employee5.setId(5);
		employee5.setFirstName("Himanshu");
		employee5.setLastName("Garg");
		employee5.setAge(50);
		employee5.setSalary(20000d);
		employeeRepository.save(employee5);

		Employee employee6=new Employee();
		employee6.setId(6);
		employee6.setFirstName("Sankalp");
		employee6.setLastName("Rao");
		employee6.setAge(22);
		employee6.setSalary(14000d);
		employeeRepository.save(employee6);
	}
	//JPQL
	//Display the first name, last name of all employees having salary greater than
	//average salary ordered in ascending by their age and in descending by their salary.
	@Test
	void test_display()
	{
		Sort sort=Sort.by(Sort.Order.asc("age"),Sort.Order.desc("salary"));
		Pageable pageable=PageRequest.of(0,2,sort);
		List<Object[]> objects=employeeRepository.findfirstNameAndlastName(pageable);
		for(Object[] objects1:objects)
		{
			System.out.println(objects1[0]+" ");
			System.out.println(objects1[1]+" ");
		}
	}
	//JPQL
	//Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.

	@Transactional
	@Rollback(value = false)
	@Test
	void test_update_employeesalary()
	{
		double avgsalary=employeeRepository.findAverageSalary();
		employeeRepository.updateSalary(20000d,avgsalary);
	}

	//JPQL
	//Delete all employees with minimum salary.
	@Transactional
	@Rollback(value = false)
	@Test
	void test_delete_employee_bysalary()
	{
		double minsalary=employeeRepository.findMinimumSalary();
		employeeRepository.deleteEmployeeWheresalaryisMIN(minsalary);
	}
	//Native SQL Queries
	//Display the id, first name, age of all employees where last name ends with "singh"
	@Test
	void test_display_accto_lastname()
	{
		List<Object[]> objects=employeeRepository.findAllEmployeehavinglastNameasSingh();
		for(Object[] objects1:objects)
		{
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println(objects1[0]+"::"+objects1[1]+"::"+objects1[2]);
		}
	}
	//Native SQL Queries
	//Delete all employees with age greater than 45(Should be passed as a parameter)
	@Test
	void test_delete_byage()
	{
		employeeRepository.deleteEmployeebyage(45);
	}
	//Inheritance Mapping
	//Implement and demonstrate Single Table strategy.
	@Test
	void test_create_payment_bycreditcard()
	{
		CreditCard creditCard=new CreditCard();
		creditCard.setId(1);
		creditCard.setAmount(2300d);
		creditCard.setCardnumber("232323232");
		paymentRepository.save(creditCard);
	}
	@Test
	void test_create_payment_bycheck()
	{
		Check check=new Check();
		check.setId(2);
		check.setAmount(1200d);
		check.setChecknumber("34VAV5");
		paymentRepository.save(check);
	}
	//Inhertiance Mapping
	//Implement and demonstrate Table Per Class strategy.
	@Test
	void test_create_creditcard1()
	{
		CreditCard1 creditCard1=new CreditCard1();
		creditCard1.setId(1);
		creditCard1.setAmount(1200d);
		creditCard1.setCardnumber("282982928");
		payment1Repository.save(creditCard1);
	}
	@Test
	void test_create_check1()
	{
		Check1 check1=new Check1();
		check1.setId(1);
		check1.setAmount(2300d);
		check1.setChecknumber("26GY2");
		payment1Repository.save(check1);
	}
	//Inhertiance Mapping
	//Implement and demonstrate Joined strategy.
	@Test
	void test_create_check2()
	{
		Check2 check2=new Check2();
		check2.setId(1);
		check2.setChecknumber("KJSAD2232");
		check2.setAmount(3400d);
		payment2Repository.save(check2);
	}
	@Test
	void test_create_creditcard2()
	{
		CreditCard2 creditCard2=new CreditCard2();
		creditCard2.setId(2);
		creditCard2.setCardnumber("2345678");
		creditCard2.setAmount(8900d);
		payment2Repository.save(creditCard2);
	}

	//Component Mapping
	//Implement and demonstrate Embedded mapping using employee table having following fields:
	// id, firstName, lastName, age, basicSalary, bonusSalary, taxAmount, specialAllowanceSalary.
	@Test
	void test_componentmapping()
	{
		EmployeeDetail employeeDetail=new EmployeeDetail();
		employeeDetail.setId(1);
		employeeDetail.setFirstName("Aman");
		employeeDetail.setLastName("Sharma");
		employeeDetail.setAge(21);
		  EmployeeSalary employeeSalary=new EmployeeSalary();
		   employeeSalary.setBasicSalary(15000l);
		   employeeSalary.setBonusSalary(1000l);
		   employeeSalary.setTaxAmount(600l);
		   employeeSalary.setSpecialAllowanceSalary(2000l);
 		  employeeDetail.setEmployeeSalary(employeeSalary);
 		  employeeDetailRepository.save(employeeDetail);
	}
}
