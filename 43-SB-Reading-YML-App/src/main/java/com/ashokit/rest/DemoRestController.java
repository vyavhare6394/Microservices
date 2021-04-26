package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.constants.AppConstants;
import com.ashokit.props.DemoConfigProps;

@RestController
public class DemoRestController {

	@Autowired
	private DemoConfigProps configProps;

	@GetMapping("/welcome")
	public String welcome() {
		return configProps.getProperties().get(AppConstants.WELCOME_MSG);
	}

	@GetMapping("/greet")
	public String greetMsg() {
		return configProps.getProperties().get(AppConstants.GREET_MSG);
	}

	@GetMapping("/test")
	public String testMsg() {
		return configProps.getProperties().get(AppConstants.TEST_MSG);
	}

}
