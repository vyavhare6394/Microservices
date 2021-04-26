package com.ashokit.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ashokit.request.PassengerInfo;
import com.ashokit.response.Ticket;

@Component
public class ERailClient {

	private static final String REST_ENDPOINT_URL = "http://localhost:8084/bookTicket";

	public void invokeRestApi() {
		
		PassengerInfo pinfo = new PassengerInfo();
		pinfo.setFirstName("Ashok");
		pinfo.setLastName("Kumar");
		pinfo.setJourneyDate("20-Aug-2020");
		pinfo.setFrom("HYD");
		pinfo.setTo("Pune");
		pinfo.setTrainNumber("7579");
		
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", "application/json");
		headers.add("Content-Type", "application/json");
		
		HttpEntity<PassengerInfo> reqEntity = new HttpEntity<>(pinfo, headers);
		
		RestTemplate rt = new RestTemplate();
		
		//ResponseEntity<Ticket> ticketEntity = rt.postForEntity(REST_ENDPOINT_URL, reqEntity, Ticket.class);
		
		ResponseEntity<Ticket> ticketEntity = rt.exchange(REST_ENDPOINT_URL, HttpMethod.POST, reqEntity, Ticket.class);
		
		if(201==ticketEntity.getStatusCodeValue()) {
			Ticket body = ticketEntity.getBody();
			System.out.println(body);
		}
		
	}

}
