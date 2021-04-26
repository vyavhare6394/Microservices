package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.service.StockPriceService;

@RestController
@RequestMapping("/price")
public class StockPriceRestController {

	@Autowired
	private Environment env;

	@Autowired
	private StockPriceService stockPriceService;

	@GetMapping(value = "/stockprice/{companyName}")
	public ResponseEntity<Double> stockPrice(@PathVariable("companyName") String companyName) {

		Double stockPrice = stockPriceService.getStockPrice(companyName);

		System.out.println("Request Processed By Server Running On :: " + env.getProperty("local.server.port"));

		return new ResponseEntity<>(stockPrice, HttpStatus.OK);
	}

}
