package com.customerDetails.Example.exceptionHandling;

public class ValuesNotPresent extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 public ValuesNotPresent() {
		 super();
	 }
public ValuesNotPresent(String message) {
	super(message);
}
}	

