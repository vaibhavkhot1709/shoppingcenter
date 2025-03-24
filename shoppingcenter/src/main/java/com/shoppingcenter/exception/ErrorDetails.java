package com.shoppingcenter.exception;

import lombok.Data;

@Data
public class ErrorDetails {

	private int statusCode;
	//private LocalDateTime localDateTime;
	private String errorMessage;
}
