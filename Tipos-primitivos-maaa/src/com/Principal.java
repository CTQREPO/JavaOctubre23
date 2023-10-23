package com;

public class Principal {
	
public static void main(String[] args) {
	//tipos primitivos
	
	//Enteros
	byte b = 10;
	short s = 10;
	int i = 10;
	long l = 10;
	
	//Decimales
	float f = 23.9f;
	double d = 97.8;
	
	//Booleans y Caracteres
	boolean bo1 = false;
	char x = 'n';
	
	//Cadenas
	String m = "bdaja";
	
	//Wrappers
	Byte  by = 40;
	Byte by2 = new Byte("50");
	
	Short sh = 30;
	Integer ii = 40;
	Long lo = 70L;
	Float ff = 90.5f;
	Double dd = 90.9908;
	
	Boolean bl = true;
	Character ch = 'f';
	
	ii.compareTo(new Integer(20));/*esto es un metodo de
	un wrapper*/
	System.out.println(Integer.parseInt("40")+50);
	
}
}
