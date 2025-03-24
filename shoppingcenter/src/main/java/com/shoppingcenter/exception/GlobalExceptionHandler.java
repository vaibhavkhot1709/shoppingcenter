package com.shoppingcenter.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value={ShopExistsException.class})
	public ResponseEntity<?> shopExistException(ShopExistsException shopExistsException){
		ErrorDetails errorDetails=new ErrorDetails();
		errorDetails.setStatusCode(HttpStatus.BAD_REQUEST.value());
		errorDetails.setErrorMessage(shopExistsException.getMessage());
		
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value= {ShopNotExistsException.class})
	public ResponseEntity<?> shopNotExistException(ShopNotExistsException shopNotExistsException){
		ErrorDetails errorDetailsShopNotFound=new ErrorDetails();
		errorDetailsShopNotFound.setStatusCode(HttpStatus.NOT_FOUND.value());
		errorDetailsShopNotFound.setErrorMessage(shopNotExistsException.getMessage());
		
		return new ResponseEntity<>(errorDetailsShopNotFound, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value= {NoDataInDatabase.class})
	public ResponseEntity<?> noDataInDatabase(NoDataInDatabase noDataInDatabase){
		ErrorDetails errorDetailsShopNotFound=new ErrorDetails();
		errorDetailsShopNotFound.setStatusCode(HttpStatus.NOT_FOUND.value());
		errorDetailsShopNotFound.setErrorMessage(noDataInDatabase.getMessage());
		
		return new ResponseEntity<>(errorDetailsShopNotFound, HttpStatus.NOT_FOUND);
	}


}
