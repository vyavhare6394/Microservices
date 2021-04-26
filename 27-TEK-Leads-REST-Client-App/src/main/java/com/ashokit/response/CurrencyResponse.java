package com.ashokit.response;

import lombok.Data;

@Data
public class CurrencyResponse {

	private Integer currencyId;
	private String currencyFrom;
	private String currencyTo;
	private Double currencyValue;

}
