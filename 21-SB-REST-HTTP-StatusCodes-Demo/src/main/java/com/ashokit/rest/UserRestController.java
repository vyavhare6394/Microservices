package com.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.binding.User;

@RestController
public class UserRestController {

	@GetMapping(value = "/getUser/{userid}", produces = "application/json")
	public ResponseEntity<User> getUserData(@PathVariable("userid") Integer userId) {

		if (userId < 0) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else if (userId >= 100) {
			User user = new User();
			user.setUserId(userId);
			user.setUserName("Ashok");
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}

	}
	
	@PostMapping(
			value="/addUser",
			consumes = "application/json"
	)
	public ResponseEntity<String> addUser(@RequestBody User user){
		System.out.println(user);
		return new ResponseEntity<String>("User Added", HttpStatus.CREATED);
	}
}
