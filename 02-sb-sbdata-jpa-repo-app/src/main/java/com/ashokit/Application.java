package com.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.ashokit.entities.ContactDtlsEnity;
import com.ashokit.repositories.ContactDtlsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		ContactDtlsRepository dtlsRepo = ctxt.getBean(ContactDtlsRepository.class);
		//List<ContactDtlsEnity> list = dtlsRepo.findAll();
		//List<ContactDtlsEnity> list = dtlsRepo.findAll(Sort.by("contactName").ascending());
		
		int pageSize = 3;
		int pageNo = 3;
		PageRequest  pg = PageRequest.of(pageNo, pageSize);
		
		Page<ContactDtlsEnity> pageData = dtlsRepo.findAll(pg);
		
		int totalPages = pageData.getTotalPages();
		
		System.out.println("Total Pages :: " + totalPages);
		
		List<ContactDtlsEnity> list = pageData.getContent();
		list.forEach(c -> {
			System.out.println(c);
		});

	}

}
