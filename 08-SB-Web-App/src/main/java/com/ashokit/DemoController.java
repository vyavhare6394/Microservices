package com.ashokit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class DemoController {

	@RequestMapping(value = { "/", "/index", "/home" }, method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();

		// set data to model in key-value format
		mav.addObject("msg", "Welcome to Spring MVC with Spring Boot..!!");

		// set logical view name
		mav.setViewName("index");

		return mav;
	}

	@RequestMapping(value = { "/home" }, method = RequestMethod.POST)
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();

		// set data to model in key-value format
		mav.addObject("msg", "Welcome to Ashok IT..!!");

		// set logical view name
		mav.setViewName("index");

		return mav;
	}

}
