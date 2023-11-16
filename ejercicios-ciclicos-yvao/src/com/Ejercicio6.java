package com;

public class Ejercicio6 {

	public static void main(String[] args) {
		
	double inversion=1000.00;
	double interes=1.02;
	int mes=1;
	
	
	
	for(int i=1; i<=12; i++) {
		
		inversion=inversion*interes;
		
		mes++;
		
	}
	System.out.println("Total:" +inversion);
	}
			
}
