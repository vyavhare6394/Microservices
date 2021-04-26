package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entities.ContactDtlsEnity;
import com.ashokit.repositories.ContactDtlsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		ContactDtlsRepository dtlsRepo = ctxt.getBean(ContactDtlsRepository.class);

		ContactDtlsEnity entity = new ContactDtlsEnity();
		entity.setContactId(101);
		entity.setContactName("John");
		entity.setContactNumber(797979799l);

		dtlsRepo.save(entity);

		System.out.println("Record Saved..........");

	}

}
