package com.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fpd")
public class FpdScoresRestController {

	@GetMapping(value = "/score")
	public String getFpdScores(
			@RequestParam(
					value = "ssn", 
					required = false, 
					defaultValue = "7797997979") Long ssn) {
		
		System.out.println("SSN :: " + ssn);
		// logic retrive from db
		return "FPD Score Is : 75";
		
	}

}
