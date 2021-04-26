package com.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.request.PassengerInfo;
import com.ashokit.response.TicketInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api("This is AirIndia Distributed Component")
public class AirIndiaRestController {

	@ApiResponses(value= {
			@ApiResponse(code=201, message="Resource Created"),
			@ApiResponse(code=500, message="Server Error")
	})
	@ApiOperation("This is used to book Flight Ticket")
	@PostMapping(
				value = "/bookFlightTicket",
				consumes = {
						"application/json",
						"application/xml"
				},
				produces = {
						"application/json",
						"application/xml"
				}
	)
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo pinfo) {
		// logic to book ticket
		// send ticket info
		TicketInfo ticket = new TicketInfo();
		ticket.setName(pinfo.getFname() + " " + pinfo.getLname());
		ticket.setFrom(pinfo.getFrom());
		ticket.setTo(pinfo.getTo());
		ticket.setTicketStatus("CONFIRMED");
		ticket.setTicketPrice("4500.00 INR");
		ticket.setJourneyDate(pinfo.getJourneyDate());
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}
	
	@ApiOperation("This is used to get PNR status")
	@GetMapping(value="/pnrstatus/{pnr}")
	public String getPNRStatus(@PathVariable("pnr") String pnrNo) {
		return "CONFIRMED";
	}
}
