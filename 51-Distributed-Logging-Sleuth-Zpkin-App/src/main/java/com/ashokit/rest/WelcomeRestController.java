package com.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	@GetMapping(value = "/welcome")
	public String getWelcomeMsg() {
		logger.info(" **** getWelcomeMsg( ) execution started ****");
		String msg = "Welcome to Ashok IT...!!";
		logger.info(" **** getWelcomeMsg( ) execution ended ****");
		return msg;
	}
}
