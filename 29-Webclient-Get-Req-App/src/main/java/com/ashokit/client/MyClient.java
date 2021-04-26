package com.ashokit.client;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.ashokit.response.CurrencyResponse;

@Component
public class MyClient {

	public void invokeRestApi(String from, String to) {
		String url = "https://tekleads-ce-api.cfapps.io/getCurrencyExchangeCost/from/{from}/to/{to}";
		
		WebClient webClient = WebClient.create();
		
		/*String response = webClient.get()
		   						   .uri(url,from,to)
				 				   .retrieve()
				 				   .bodyToMono(String.class)
				 			   	   .block();*/
		
		
		System.out.println("**************Sync :: Rest Call Start*********************");
		
		 CurrencyResponse response= webClient.get()
											 .uri(url, from, to)
											 .retrieve()
											 .bodyToMono(CurrencyResponse.class)
											 .block();
		 System.out.println(response);
		
		System.out.println("**************Sync :: Rest Call End****************");
		
	}
	
	public void invokeRestApiAsync(String from, String to) {
		String url = "https://tekleads-ce-api.cfapps.io/getCurrencyExchangeCost/from/{from}/to/{to}";
		
		WebClient webClient = WebClient.create();

		System.out.println("**************Async :: Rest Call Start*********************");
		
							webClient.get()
									 .uri(url,from,to)
									 .accept(MediaType.APPLICATION_JSON)
									 .retrieve()
									 .bodyToMono(CurrencyResponse.class)
									 .subscribe(MyClient::handleResponse);		
		
		System.out.println("**************Async :: Rest Call End****************");
		
	}
	
	public static void handleResponse(CurrencyResponse response) {
		System.out.println(response);
		//push response to apache kafka
	}
	
}
