package com.ashokit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.domain.Student;

@Controller
public class StudentController {

	@ModelAttribute
	public void init1(Model model) {
		System.out.println("******* init1( ) method called *******");

		List<String> coursesList = new ArrayList();
		coursesList.add("Java");
		coursesList.add("Python");
		coursesList.add("Hadoop");
		coursesList.add("Testing");
		model.addAttribute("courses", coursesList);

		List<String> timingsList = new ArrayList();
		timingsList.add("Morning");
		timingsList.add("Afternoon");
		timingsList.add("Evening");
		model.addAttribute("timings", timingsList);

		// Sending form binding object to UI
		Student s = new Student();
		model.addAttribute("student", s);
	}

	@ModelAttribute
	public void init2(Model model) {
		System.out.println("******* init2( ) method called *******");
		// Sending form binding object to UI
		Student s = new Student();
		model.addAttribute("student", s);
	}

	@GetMapping(value = { "/", "/register" })
	public String loadForm(Model model) {
		System.out.println("******* loadForm( ) method called *******");
		// Returning logical view name
		return "studentReg";
	}

	@PostMapping(value = "/register")
	public String handleSubmitBtn(@ModelAttribute("student") Student s, Model model) {
		System.out.println("******* handleSubmitBtn( ) method called *******");
		// logic to call service layer method
		// returning logical view name
		return "regSuccess";
	}

}
