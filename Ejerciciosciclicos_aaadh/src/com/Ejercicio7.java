package com;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1, n2, x, y;
		System.out.println("Digite dos numeros");
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		x = n1 % 2;
		y = n2 % 2;
		System.out.println("\nLos números pares del: " + n1 + " al  " + n2 + " son : ");
		for (int i = n1; i <= n2; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
