package com.ashokit.response;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Ticket {

	private String ticketId;
	private String ticketStatus;
	private Double ticketPrice;
	private String passengerName;
	private String from;
	private String to;
	private String trainNumber;
	private String journeyDate;
}
