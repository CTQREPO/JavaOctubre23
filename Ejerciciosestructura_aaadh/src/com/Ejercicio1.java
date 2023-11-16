//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.

package com;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		int x1 = 0;
		int x2 = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresa dos numeros");
		System.out.println("Ingresa numero 1:");
		x1 = entrada.nextInt();
		System.out.println("Ingresa numero 2:");
		x2 = entrada.nextInt();
		
		if (x1 == x2) {
			System.out.println("Son iguales");

		} else if (x1 > x2) {

			System.out.println("El primer numero es mayor");
		} else {
			System.out.println("El segundo numero es mayor");
		}
	}

}
