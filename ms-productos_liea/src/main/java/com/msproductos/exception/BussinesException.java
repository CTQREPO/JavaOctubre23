package com.msproductos.exception;

public class BussinesException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public BussinesException() {  
		super();
	 }
	 public BussinesException(String message) {  
		 super(message);
	 }
}
