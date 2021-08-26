package com.way2learnonline.service;

import java.sql.SQLException;

import org.omg.IOP.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;


public class BankServiceImpl implements BankService {

	@Autowired private AccountService accountService;
	
	 
	@Autowired
	private PlatformTransactionManager txManager;
	

	
	public Long transfer(Long fromAccountNumber, Long toAccountNumber, int amount) throws SQLException {
		
			//begin the transaction
			DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
			TransactionStatus status = txManager.getTransaction(definition);
			
			System.out.println("in Transfer() method : "+ status.isNewTransaction());
			
			try {
				Long transactionId= accountService.debit(amount,fromAccountNumber);  //1
				accountService.credit(amount, toAccountNumber);		//2		
							
				//commit transaction
				txManager.commit(status);
				
				return transactionId;
				
			}catch(Exception e) {
				txManager.rollback(status);
				System.out.println("something went wrong");
				return null;
			}
		
	}
	
	
	

}
