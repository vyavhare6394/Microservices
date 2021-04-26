package com.ashokit;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.OrderDetailsEntity;
import com.ashokit.repositories.OrderDetailsRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		OrderDetailsRepo orderDetRepo = ctxt.getBean(OrderDetailsRepo.class);

		OrderDetailsEntity ode = new OrderDetailsEntity();
		ode.setOrderBy("Charles");
		ode.setOrderPlacedDate(new Date());

		OrderDetailsEntity savedEntity = orderDetRepo.save(ode);

		System.out.println("Record Saved :: " + savedEntity);

		ctxt.close();

	}

}
