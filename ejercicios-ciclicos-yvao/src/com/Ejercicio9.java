package com;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println("introduzca el primer numero");
		num1 = a.nextInt();
		System.out.println("Introduzca el segundo numero");
		num2 = a.nextInt();

		if (num1 > num2) {

			for (int i = num2; i <= num1; i++) {
				if (i % 2 == 0) {
				System.out.println(i);
				}
			}
		} else {
			for (int i = num1; i <= num2; i++) {
				if (i % 2 == 0) {
				System.out.println(i);
				}
			}
		}
	}
}

	

