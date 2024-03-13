package com.exception;

public class UserDefinedException extends RuntimeException {

	public UserDefinedException(String message) {
		super(message);
		System.out.println(message);
	}


}
