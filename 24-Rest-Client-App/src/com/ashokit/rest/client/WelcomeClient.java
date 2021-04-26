package com.ashokit.rest.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WelcomeClient {
	
	public static void main(String[] args) {
		try {
			URL url = new URL("http://localhost:8083/welcome");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			int httpStatusCd = conn.getResponseCode();
			if(httpStatusCd==200) {
				InputStream is = conn.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				String line = br.readLine();
				while(line!=null) {
					System.out.println(line);
					line = br.readLine();
				}
				conn.disconnect();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
