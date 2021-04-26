package com.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestControler {

	@GetMapping(value = "/hello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return "Hello, " + name;
	}
}
