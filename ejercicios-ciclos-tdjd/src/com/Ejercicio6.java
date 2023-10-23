package com;

public class Ejercicio6 {
	public static void main(String[] args) {
		double inversion=1000.00;
		int mes=1;
		
		while (mes<=12){
		inversion=inversion*1.02;
			//inversion=(2*inversion)/100;
			mes++;
			
	
		}
		
		System.out.println("La canidad final es: "+inversion);
		
		
				
		
	}

}
