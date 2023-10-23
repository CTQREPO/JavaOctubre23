//Realiza un programa que pida un número por teclado y nos indique si es par o impar.

package com;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		int x;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresa un numero:");
		x = entrada.nextInt();
		if (x % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero no es par");
		}
	}
}
