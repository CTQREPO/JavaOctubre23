//Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara cuando el promedio de las edades sea superior a 25.
package com;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double promedio = 0;
		int edad = 0;
		double suma = 0;
		for (int i = 1; promedio <= 25; i++) {
			System.out.println("Edad");
			edad = entrada.nextInt();
			while (edad < 0) {
				edad = entrada.nextInt();
			}
			suma = (suma + edad);
			promedio = suma / i;
			System.out.println("Promedio: " + promedio);
		}
	}
}

