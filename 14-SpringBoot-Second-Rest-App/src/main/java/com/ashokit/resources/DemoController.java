package com.ashokit.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

	public DemoController() {
		System.out.println("+++++++DemoController::Constructor++++++++++");
	}

	//http://localhost:7071/demo
	@GetMapping
	public String welcome() {
		String msg = "Welcome to RESTful Services...!!";
		return msg;
	}

	// http://localhost:7071/demo/greet
	@GetMapping(value="/greet")
	public String greet() {
		return "Good Morning...!";
	}

	// http://localhost:7071/demo/test
	@GetMapping("/test")
	public String test() {
		return "This is Test msg";
	}
	
	//http://localhost:7071/demo/demo
	@GetMapping("/de34435dsfsdfmo")
	public String demo() {
		return "This is Demo Msg...!";
	}
}
