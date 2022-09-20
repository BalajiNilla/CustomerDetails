package com.customerDetails.Example.exceptionHandling;


public class CannotsaveException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CannotsaveException() {
		super();
	}
	public CannotsaveException(String message) {
		super(message);
	}

}
