package com.ashokit.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryParamRestController {

	@GetMapping("/course")
	public String getCourseDetails(@RequestParam("cname") String courseName,
			@RequestParam("tname") String trainerName) {

		if (courseName.equals("JRTP") && trainerName.equals("Ashok")) {
			return "Starting from 20-July-2020 @11:30 AM IST";
		}

		return "Please Check Our Website http://www.ashokit.in For More Details";
	}

}
