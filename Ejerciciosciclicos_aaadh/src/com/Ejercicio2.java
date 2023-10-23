//Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
//23 x 95 = ???;

package com;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.println("ingresa el numero a multiplicar");
		num1 = entrada.nextInt();
		System.out.println("Iteracion deseada");
		num2 = entrada.nextInt();
		for (int k = 0; k < num2; k++) {
			if (k != 0) {
				System.out.println(num1 + "*" + k + "*" + (num1 * k));
			}
		}
	}

}
