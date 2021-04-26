package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@Autowired
	private Environment env;

	@GetMapping("/welcome")
	public String welcomeMsg() {
		String msg = "Welcome to REST API...!!";

		String serverPort = env.getProperty("local.server.port");

		msg = msg.concat(" I am from Server Which is running on Port :: " + serverPort);

		return msg;
	}
}
