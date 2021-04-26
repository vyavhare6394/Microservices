package com.ashokit.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WishClient {

	public String invokeWishApi() {

		String url = "http://localhost:9091/wish";

		RestTemplate rt = new RestTemplate();
	
		/*rt.getInterceptors()
		   .add(new BasicAuthorizationInterceptor("admin", "admin@123"));
		ResponseEntity<String> resEntity = rt.getForEntity(url, String.class);*/
		
		
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth("admin", "admin@123");
		
		HttpEntity<String> req = new HttpEntity<>(headers);
		
		ResponseEntity<String> responseEntity =
				rt.exchange(url, HttpMethod.GET, req, String.class);
		String body = responseEntity.getBody();

		return body;
	}

}
