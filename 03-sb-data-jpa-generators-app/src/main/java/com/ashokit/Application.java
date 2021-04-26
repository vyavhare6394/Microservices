package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entities.CustomerDtlsEntity;
import com.ashokit.repositories.CustomerDtlsRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		CustomerDtlsRepo repo = ctxt.getBean(CustomerDtlsRepo.class);

		CustomerDtlsEntity entity = new CustomerDtlsEntity();
		entity.setCustomerName("Raju");
		entity.setCustomerEmail("raju.k@gmail.com");

		CustomerDtlsEntity savedEntity = repo.save(entity);

		System.out.println("Saved Record :: " + savedEntity);

		ctxt.close();

	}

}
