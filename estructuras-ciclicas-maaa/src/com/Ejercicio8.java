package com;

import java.util.Scanner;

public class Ejercicio8 {
//8. Programa Java que lea dos números y muestre los números desde el menor hasta el mayor

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite un numero");

		int num1, num2;
		num1 = entrada.nextInt();

		System.out.println("Digite otro numero");
		num2 = entrada.nextInt();

		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.println(i);
			}
		} else if (num2 > num1) {
			for (int i = num1; i <= num2; i++) {
				System.out.println(i);
			}
		}
		else {
			System.out.println("Ambos numeros son iguales");
		}
	}
}
