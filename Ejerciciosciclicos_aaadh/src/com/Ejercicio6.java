package com;

public class Ejercicio6 {
	public static void main(String[] args) {
		double inversion = 1000;
		int mes = 1;
		while (mes <= 12) {
			inversion = inversion * 1.02;
			mes++;
		}
		System.out.println(inversion);
	}

}
