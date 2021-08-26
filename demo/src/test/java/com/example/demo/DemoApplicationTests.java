package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.services.EmployeeService;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private EmployeeRepository empRepo;
	
	
	@Test
	public void createEmployeeTest() {
		Employee emp = new Employee("vishal", "mumbai",  2000.00);
		empService.createEmployee(emp);
	}
	
	@Test 
	public void findEmployeetest() {
	
	}

	@Test
	void contextLoads() {
	}

}
