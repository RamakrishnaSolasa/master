package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
//	//custom query with jpql statement 
//	@Query(value = "SELECT e from Employee e where e.city=:city")
//	public List<Employee> getEmpByCity(@Param("city") String city);
//	
//	//custom query with native sql statement
//	@Query(value = "SELECT * from Employee  where city=:city", nativeQuery = true)
//	public List<Employee> getAllEmpByCity(@Param("city") String city);
//	
//	
//	public List<Employee> getAll();
//	
//	//using query methods 
//	public List<Employee>  findAllByCity(String city);
//	
//	public List<Employee> findAllByCityAndSalaryGreaterThan(String city, double salary);

}
