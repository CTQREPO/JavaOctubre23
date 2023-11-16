package com;

public class Ejercicio06 {

	public static void main(String[] args) {

		double inversion = 1000;
		for (int i = 1; i <= 12; i++) {
			inversion = inversion + (inversion * 0.02);
		}
		
		System.out.println("El toatal de la inversion en una año es de: " + inversion);
	}

}
