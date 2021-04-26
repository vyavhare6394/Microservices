package com.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ashokit.response.CurrencyResponse;

@Service
public class CurrencyService {

	private String endpointUrl = "https://tekleads-ce-api.cfapps.io/getCurrencyExchangeCost/from/{from}/to/{to}";

	public void invokeRestApi(String from, String to) {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> respEntity = 
				rt.getForEntity(endpointUrl, String.class, from, to);

		if (200 == respEntity.getStatusCodeValue()) {
			String responseBody = respEntity.getBody();
			System.out.println("****************Response Starts ********************");
			System.out.println(responseBody);
			System.out.println("**************Response Ends*************************");
		}
	}
	
	
	public void invokeRestApiNew(String from, String to) {
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<CurrencyResponse> resEntity = 
				rt.getForEntity(endpointUrl, CurrencyResponse.class, from, to);
		
		if(200==resEntity.getStatusCodeValue()) {
			CurrencyResponse body = resEntity.getBody();
			System.out.println(body);
		}

	}
	
	
}
