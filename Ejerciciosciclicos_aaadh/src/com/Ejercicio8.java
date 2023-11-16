//Programa Java que lea dos números y muestre los números desde el menor hasta el mayor

package com;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1, n2;
		System.out.println("Digite dos numeros");
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();

		if (n1 < n2) {
			System.out.println("El orden de los numeros es:" + n1 + "<" + n2);
		} else {
			System.out.println("El orden de los numeros es:" + n2 + "<" + n1);
		}
	}
}
