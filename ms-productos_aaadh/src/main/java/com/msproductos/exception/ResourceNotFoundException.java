package com.msproductos.exception;

public class ResourceNotFoundException extends RuntimeException {

	/*
	 * 
	 */
	private static final long serialVersionUIS = 1L;

	public ResourceNotFoundException() {
		super();
	}

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
