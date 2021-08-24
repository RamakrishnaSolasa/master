package jpademo1.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpademo1");
		
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		
//		insert operation

//		Employee emp = new Employee(102, "Amar", "Hyderabad", 400.00);
//		tx.begin();
//		entityManager.persist(emp);
//		tx.commit();
		
		
//		retrieve the record
//		Employee emp = entityManager.find(Employee.class, 108);
//		System.out.println(emp);
		
		//update record
//		tx.begin();
//		Employee emp = entityManager.find(Employee.class, 101);
//		emp.setCity("Chennai");
//		tx.commit();
//		System.out.println(emp);
		
		//delete operation
//		tx.begin();
//		Employee emp = entityManager.find(Employee.class, 101);
//		entityManager.remove(emp);
//		tx.commit();
		
		entityManager.close();
	}

}
