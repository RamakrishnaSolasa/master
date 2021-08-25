package com.example.demo.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class EmpRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	
}
