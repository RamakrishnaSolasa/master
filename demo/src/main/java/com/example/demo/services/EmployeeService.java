package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepository;
	
	public Employee createEmployee(Employee emp) {
		return empRepository.save(emp);
	}

	public Employee getEmployee(int id) {
		
		Optional<Employee> optEmployee =  empRepository.findById(id);
		
		return optEmployee.isPresent() ? optEmployee.get() : null;	
	}
	
	public Employee deleteEmployee(int id) {
		Employee emp = getEmployee(id);
		if(emp!=null) {
			 empRepository.delete(emp);
			 return emp;
		}
		
		return null;
	}
	
	public Employee updateEmployee(Employee emp, int id) {
		Employee employee = getEmployee(id);
		if(employee!=null) {
			 employee.setCity(emp.getCity());
			 employee.setEname(emp.getEname());
			 employee.setSalary(emp.getSalary());
			 return employee;
		}
		
		return null;
	}
	
}
