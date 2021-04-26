package com.ashokit.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.ashokit.request.PassengerInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ERailClient {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:8084/bookTicket");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();

		con.setRequestMethod("POST");

		// Setting HTTP Headers
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("Accept", "application/xml");

		// set data to request body
		PassengerInfo p = new PassengerInfo();
		p.setFirstName("John");
		p.setLastName("Smith");
		p.setFrom("HYD");
		p.setJourneyDate("15-Aug-2020");

		ObjectMapper mapper = new ObjectMapper();
		String jsonStr = mapper.writeValueAsString(p);

		con.setDoOutput(true);
		OutputStream outputStream = con.getOutputStream();
		outputStream.write(jsonStr.getBytes());
		outputStream.flush();
		
		//Get Response status code
		int responseCode = con.getResponseCode();
		if(responseCode==201) {
			InputStream inputStream = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(inputStream);
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while(line!=null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			con.disconnect();
		}

	}

}
