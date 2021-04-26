package com.ashokit.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public String welcomeMsg() {
		String msg = "Welcome To Ashok IT...!!";
		return msg;
	}

	@GetMapping("/welcomeNew")
	public ResponseEntity<String> welcome() {
		String msg = "Welcome to Ashok IT";
		return new ResponseEntity(msg, HttpStatus.OK);
	}

}
