package com;

import java.util.Scanner;

public class Ejercicio9 {
//9. Programa Java que lea dos números y muestre los números pares entre ellos

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int a, b;

		System.out.println("Digite un numero: ");

		a = entrada.nextInt();

		System.out.println("Digite otro numero: ");

		b = entrada.nextInt();

		if (b > a) {

			for (int i = a; i <= b; i++) {

				if (i % 2 == 0) {

					System.out.println(i);
				}
			}
		} else if (a > b) {

			for (int i = b; i <= a; i++) {

				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		}
		else {
			if (a % 2 == 0) {
				System.out.println(a);
			}
			else {
				System.out.println("Ambos numeros son iguales y son impares");
			}
		}

	}
}
