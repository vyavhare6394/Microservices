package com.ashokit.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.request.PassengerInfo;
import com.ashokit.response.Ticket;

@RestController
public class ERailResource {
	
	@PostMapping(
			value="/bookTicket",
			produces= {
					"application/xml",
					"application/json"
			},
			consumes= {
					"application/json",
					"application/xml"
			}
	)
	public ResponseEntity<Ticket> bookTicket(@RequestBody PassengerInfo pinfo) {	
		System.out.println(pinfo);
		
		// logic		
		Ticket t = new Ticket();
		t.setTicketId("TA02899");
		t.setTicketStatus("CONFIRMED");
		t.setJourneyDate(pinfo.getJourneyDate());
		t.setPassengerName(pinfo.getFirstName() + " " + pinfo.getLastName());
		t.setTrainNumber(pinfo.getTrainNumber());
		t.setTicketPrice(350.00);
		t.setFrom(pinfo.getFrom());
		t.setTo(pinfo.getTo());
		
		try {
			Thread.sleep(10000);
		}catch(Exception e) {
			
		}
		
		return new ResponseEntity<>(t, HttpStatus.CREATED);
		
	}

	/*@PostMapping(
			value="/bookTicket",
			produces= {
					"application/xml",
					"application/json"
			},
			consumes= {
					"application/json",
					"application/xml"
			}
	)
	public Ticket bookTicket(@RequestBody PassengerInfo pinfo) {	
		
		System.out.println(pinfo);
		
		// logic		
		Ticket t = new Ticket();
		t.setTicketId("TA02899");
		t.setTicketStatus("CONFIRMED");
		t.setJourneyDate(pinfo.getJourneyDate());
		t.setPassengerName(pinfo.getFirstName() + " " + pinfo.getLastName());
		t.setTrainNumber(pinfo.getTrainNumber());
		t.setTicketPrice(350.00);
		t.setFrom(pinfo.getFrom());
		t.setTo(pinfo.getTo());
		return t;
	}*/
}
