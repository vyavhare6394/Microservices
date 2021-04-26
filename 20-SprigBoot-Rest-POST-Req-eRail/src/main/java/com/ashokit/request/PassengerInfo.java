package com.ashokit.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="passenger-info")
public class PassengerInfo {

	private String firstName;
	private String lastName;
	private String from;
	private String to;
	private String journeyDate;
	private String trainNumber;

}
