package com.shoppingcenter.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value={ShopExistsException.class})
	public ResponseEntity<?> studentExistException(ShopExistsException shopExistsException){
		ErrorDetails errorDetails=new ErrorDetails();
		errorDetails.setStatusCode(HttpStatus.OK.value());
		errorDetails.setErrorMessage(shopExistsException.getMessage());
		errorDetails.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<>(errorDetails, HttpStatus.OK);
	}

}
