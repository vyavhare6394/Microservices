package com.ashokit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String displayHomePage(Model model) {
		model.addAttribute("msg", "This is home page0");
		return "homePage";
	}
}
