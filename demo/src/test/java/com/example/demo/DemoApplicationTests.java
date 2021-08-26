package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Employee;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.services.EmployeeService;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	private CustomerRepository custRepo;
	
	
	@Test
	public void createEmployeeTest() {
//		Employee emp = new Employee("vishal", "mumbai",  2000.00);
//		empService.createEmployee(emp);
		
		Employee emp = new Employee();
		emp.setName("Vishal");
		emp.setCity("mumbai");
		emp.setSalary(2000.00);
		
		empRepo.save(emp);
		
		Customer cust = new Customer();
		cust.setName("Yashwant");
		cust.setCity("Chennai");
		cust.setMobile("9933993399");
		custRepo.save(cust);
	}
	
	@Test 
	public void findEmployeetest() {
	
	}

	@Test
	void contextLoads() {
	}

}
