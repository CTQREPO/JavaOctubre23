package com;

public class Ejercicio6 {
	public static void main(String[] args) {
		

		double dinero=1000;
		double invertir=1.02;
		int mes= 1;
		
		
		for (int i = 0; i <12; i++){
			dinero = dinero*invertir;
			mes++;
		}

			System.out.println("Cantidad invertida "+dinero);
			
	}
	}


