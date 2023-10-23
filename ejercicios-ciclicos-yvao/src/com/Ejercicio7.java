package com;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		double inversion=700.00;
		double interes=1.02;
		int mes=1;
		double objetivo=1500;
		
		
		while(inversion<=objetivo) {
			
		inversion=inversion*interes;
			
			mes++;
			
		}
		System.out.println("Total:" +mes);
		

		
	}
	}

