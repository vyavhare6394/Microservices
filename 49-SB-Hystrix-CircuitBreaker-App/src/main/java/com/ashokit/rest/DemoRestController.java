package com.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DemoRestController {

	@GetMapping("/process")
	@HystrixCommand(fallbackMethod = "doWork")
	public String doProcess() {
		String response = "This msg coming from doProcess()..";

		int i = 10 / 0;

		return response;
	}

	public String doWork() {
		String response = "This msg coming from doWork()..!!";
		return response;
	}

}
