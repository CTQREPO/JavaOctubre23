package com.msproductos.exception;

public class BusinessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public BusinessException() {  
		super();
	 }
	 public BusinessException(String message) {  
		 super(message);
	 }

}
