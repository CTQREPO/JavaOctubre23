package com;

import java.util.Scanner;

public class EdadesPromedio {

	public static void main(String[] args) {

		System.out.println("Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara cuando el promedio de las edades sea superior a 25.");
		Scanner teclado = new Scanner (System.in);
		
		double promedio = 0;
		int edad = 0;
		double suma = 0;
		for (int i = 1 ; promedio <= 25; i++) {
			System.out.println("Ingrese edad de la persona en años cerrados");
			edad = teclado.nextInt();
			while( edad < 0 ) {
				System.out.println( "ERROR!, el valor debe ser positivo mayor  CERO, intente de nuevo. Ingrese número: ");
				edad= teclado.nextInt();
			}
			suma = (suma + edad);
			promedio = suma / i;
			System.out.println("Promedio: " + promedio );
		}
		teclado.close();
	}
}
