package com;

public class Principal {
	
	
	public static void main(String[] args) {
		
		//tipos primitivos
		
		//Enteros
		byte b = 10;
		short s = 10;
		int i = 10;
		long l = 10;
		
		//decimales
		float f = 23.9f;
		double d = 97.8;

		//boleans y caracteres
		boolean bol = false;
		char x = 'n';
		
		String m = "te amo amorcito";
		
		//Wrappers 
		Byte by = 40;
		Byte by2 = new Byte("50");
		
		Short sh = 30;
		Integer ii = 40;
		Long lo = 70L;
		
		Float ff = 90.5f;
		Double dd = 90.9908;
		
		Boolean bl = true;
		Character ch = 'f';
		
		
		System.out.println (ii.compareTo(new Integer(34)));
		Integer xi = ii.compareTo((new Integer(34)); //imprimir
		
		System.out.println(Integer.parseInt("500")+40); //entero
		System.out.println(500+40); //cadena
		 
	
		
		
		
		
	}

}
