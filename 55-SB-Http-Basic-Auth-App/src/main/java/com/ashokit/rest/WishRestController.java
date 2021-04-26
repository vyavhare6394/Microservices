package com.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishRestController {

	@GetMapping("/wish")
	public String wishMsg() {
		return "Welcome To Ashok IT....";
	}

}
