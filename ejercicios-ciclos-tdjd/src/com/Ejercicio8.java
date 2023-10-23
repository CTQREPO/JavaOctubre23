package com;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		System.out.println("ingrese el primer numero: ");
		int n1 = sc.nextInt();
		System.out.println("ingrese el segundo numero: ");
		int n2 = sc.nextInt();

		if (n1 > n2) {
			for (int i = n2; i <= n1; i++) {

				System.out.println(i);
			}
		} else {
			for (int i = n1; i <= n2; i++) {

				System.out.println(i);
			}

		}

	}
}