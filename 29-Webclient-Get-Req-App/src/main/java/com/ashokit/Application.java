package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.client.MyClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		MyClient clientBean = ctxt.getBean(MyClient.class);

		clientBean.invokeRestApi("USD", "INR");

		System.out.println("#####################################################################");

		clientBean.invokeRestApiAsync("USD", "INR");

		//ctxt.close();
	}

}
