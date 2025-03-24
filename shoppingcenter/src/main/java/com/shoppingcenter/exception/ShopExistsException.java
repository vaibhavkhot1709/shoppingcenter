package com.shoppingcenter.exception;

@SuppressWarnings("serial")
public class ShopExistsException extends RuntimeException{

	public ShopExistsException(String message) {
		super(message);
	}
}
