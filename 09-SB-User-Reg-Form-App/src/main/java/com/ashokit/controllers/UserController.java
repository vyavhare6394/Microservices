package com.ashokit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.model.User;

@Controller
public class UserController {

	@GetMapping(value = { "/", "/register" })
	public String loadForm() {
		return "register";
	}

	@PostMapping("/register")
	public String handleSubmitBtn(User user, Model model) {
		// Sending Data from Controller to UI
		String succMsg = "Registration completed successfully..!!";
		model.addAttribute("msg", succMsg);

		// Returning Logical View Name
		return "regSuccess";
	}

}
