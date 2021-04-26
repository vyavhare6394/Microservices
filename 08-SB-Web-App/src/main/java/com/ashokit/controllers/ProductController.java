package com.ashokit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

	@RequestMapping("/price")
	public @ResponseBody String getPrice() {
		return "Product Price Is :: $57";
	}

}
