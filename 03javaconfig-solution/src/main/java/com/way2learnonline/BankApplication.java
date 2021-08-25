package com.way2learnonline;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.way2learnonline.service.BankService;


@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) throws SQLException {

		ConfigurableApplicationContext context = SpringApplication.run(BankApplication.class);
		
		BankService bankService = context.getBean(BankService.class);
		
		bankService.transfer(1L, 2L, 2000);
	}
}
