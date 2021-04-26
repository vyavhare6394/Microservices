package com.ashokit.response;

import lombok.Data;

@Data
public class TicketInfo {

	private String from;
	private String journeyDate;
	private String passengerName;
	private String ticketId;
	private String ticketPrice;
	private String ticketStatus;
	private String to;
	private String trainNumber;

}
