package com.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.repositories.ContactDtlsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		ContactDtlsRepository dtlsRepo = ctxt.getBean(ContactDtlsRepository.class);
		
		List<String> names = dtlsRepo.getAllContactNames();
		names.forEach(name -> {
			System.out.println(name);
		});
		
		
		/*List<ContactDtlsEnity> list = dtlsRepo.getAllContactStartsWithSChar();
		list.forEach(c -> {
			System.out.println(c);
		});*/
		
		//System.out.println("Name :: "+ dtlsRepo.getContactNameByContactId("C102"));
		
		
		//ContactDtlsEnity entity = dtlsRepo.findByContactNameAndContactNumber("John", 979799799l);
		//System.out.println(entity);
		

		//System.out.println(dtlsRepo.findByContactNumber(979799799l));
		
		//System.out.println(dtlsRepo.findByContactName("Charles"));
		
		//System.out.println("Table Count :: "+ dtlsRepo.count());
		
		//dtlsRepo.deleteById("C104");
		
		
		/*Iterable<ContactDtlsEnity> findAll = dtlsRepo.findAll();
		for(ContactDtlsEnity e : findAll) {
			System.out.println(e);
		}*/
		
		/*Optional<ContactDtlsEnity> findById = dtlsRepo.findById("C303");
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}else {
			System.out.println("No Record Found...");
		}*/
		

		/*ContactDtlsEnity entity = new ContactDtlsEnity();
		entity.setContactId("C109");
		entity.setContactName("Orlen");
		entity.setContactNumber(779799799l);
		
		dtlsRepo.save(entity);*/
	}

}
