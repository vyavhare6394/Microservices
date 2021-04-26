package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		RestTemplate restTemplate = new RestTemplate();

		String url = "http://localhost:8083/welcome";
		
		ResponseEntity<String> responseEntity = 
					restTemplate.getForEntity(url, String.class);
		
		int statusCd = responseEntity.getStatusCode().value();
		
		if(statusCd==200) {
			System.out.println(responseEntity.getBody());
		}

	}

}
