package com.ashokit.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class PassengerInfo {
	private String firstName;
	private String from;
	private String journeyDate;
	private String lastName;
	private String to;
	private String trainNumber;
}
