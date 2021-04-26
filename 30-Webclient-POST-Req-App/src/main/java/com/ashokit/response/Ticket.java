package com.ashokit.response;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Ticket {
	private String from;
	private String journeyDate;
	private String passengerName;
	private String ticketId;
	private Double ticketPrice;
	private String ticketStatus;
	private String to;
	private String trainNumber;
}
