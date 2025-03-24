package com.shoppingcenter.exception;


public class NoDataInDatabase extends RuntimeException{

	public NoDataInDatabase(String message) {
		super(message);
	}
}
