package com;

import java.util.Scanner;

public class InteresMensualUnAnio {

	public static void main(String[] args) {

		System.out.println("Ingrese el valor a invertir a un a�o a un 2% mensual: ");
		Scanner teclado = new Scanner (System.in);
		
		double monto = teclado.nextDouble();
		
		for (int i = 1; i <= 12; i++) {
			monto = monto * 1.02;
		}
		System.out.println("Al final del a�o se tendr� un monto de: " + monto );
		teclado.close();
	}

}