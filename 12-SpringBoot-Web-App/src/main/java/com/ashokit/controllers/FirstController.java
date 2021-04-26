package com.ashokit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class FirstController {

	@RequestMapping(value = "/welcome")
	public ModelAndView displayWelcomeMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to Ashok IT....!!");
		mav.setViewName("index"); // logical view name
		return mav;
	}

	@RequestMapping(value = "/greet")
	public String displayGreetMsg(Model model) {
		model.addAttribute("msg", "Good Morning...!!");
		return "index";// logical view name
	}

}
