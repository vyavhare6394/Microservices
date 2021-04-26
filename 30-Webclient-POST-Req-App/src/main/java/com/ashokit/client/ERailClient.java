package com.ashokit.client;

import org.springframework.http.MediaType;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

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
		
		WebClient webClient  = WebClient.create();
		
		Ticket response = webClient.post()
							 		  .uri(REST_ENDPOINT_URL)
							 		  .body(BodyInserters.fromValue(pinfo))
							 		  .header("Content-Type","application/xml")
  						 		      .accept(MediaType.APPLICATION_JSON)
							 		  .retrieve()
							 		  .bodyToMono(Ticket.class)
							 		  .block();
		System.out.println(response);
	}

}
