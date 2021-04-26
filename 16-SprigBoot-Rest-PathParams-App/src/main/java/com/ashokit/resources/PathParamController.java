package com.ashokit.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathParamController {

	@GetMapping(value = "/course/{name}")
	public String getCourseDuration(@PathVariable("name") String courseName) {
		if ("JRTP".equals(courseName)) {
			return "Duration : 3 Months";
		} else if ("SBMS".equals(courseName)) {
			return "Duration : 75 Days";
		} else {
			return "Please check our website for more details : www.ashokit.in";
		}
	}

	@GetMapping(value = "/course/{cname}/{tname}")
	public String getCourseDetails(@PathVariable("cname") String cname, @PathVariable("tname") String tname) {

		if ("JRTP".equals(cname) && "Ashok".equals(tname)) {
			return "Starting new batch From 20-Jul-2020 @11:30 AM IST";
		} else if ("SBMS".equals(cname) && "Ashok".equals(tname)) {
			return "Starting new batch from 29-Jul-2020 @7:15 AM IST";
		} else {
			return "Please check our website for more details : www.ashokit.in";
		}
	}

	@GetMapping(value = "/course/{cname}/fastrack/{tname}")
	public String getDetails(@PathVariable("cname") String cname, @PathVariable("tname") String name) {
		return "Registration Process Is Started";
	}

}
