package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.client.HelloClient;

@RestController
public class HiRestController {

	@Autowired
	private HelloClient helloClient;

	@GetMapping(value = "/hi/{name}")
	public String sayHi(@PathVariable("name") String name) {
		
		String hiMsg = "Hi";

		String helloMsg = helloClient.invokeHelloService(name);

		return hiMsg + "--" + helloMsg;
	}
}
