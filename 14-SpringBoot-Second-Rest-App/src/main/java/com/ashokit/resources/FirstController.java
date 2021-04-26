package com.ashokit.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	//http://localhost:7071/
	@GetMapping
	public String msg() {
		return "This is my First Rest Controller";
	}
	
}
