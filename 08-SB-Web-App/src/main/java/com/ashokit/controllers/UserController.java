package com.ashokit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = { "/user", "/user1" })
public class UserController {

	@GetMapping(value = { "/index", "/index1" })
	public String index(Model model) {
		// set data in model to send to ui
		model.addAttribute("msg", "Hey User, Good Morning..!!");
		return "index";
	}
	
}
