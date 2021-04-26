package com.ashokit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

	@GetMapping(value = { "/", "/login" })
	public String loginForm() {
		return "login";
	}

	@PostMapping(value = "/login")
	public String loginCheck(HttpServletRequest req, RedirectAttributes ra, Model model) {
		String uname = req.getParameter("uname");
		String pwd = req.getParameter("pwd");

		if (uname.equals("admin") && pwd.equals("admin@123")) {
			ra.addFlashAttribute("uname", uname);
			// redirect to buildDashBoard
			return "redirect:/buildDashboard";
		}

		model.addAttribute("msg", "Invalid Credentials");
		return "login";
	}

	@GetMapping(value = "/buildDashboard")
	public String buildDashBoard(Model model) {
		System.out.println("buildDashboard() method called.......");
		return "dashboard";
	}

}
