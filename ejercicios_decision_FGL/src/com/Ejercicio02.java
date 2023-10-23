package com;

import java.util.Scanner;

public class Ejercicio02 {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		int num = 0;
		boolean isnum = false;

		while (!isnum) {
			System.out.print("Porfavor ingrese un numero: ");
			if (reader.hasNextInt()) {
				num = reader.nextInt();
				isnum = true;
			} else {
				System.out.println("Porfavor ingrese un numero valido");
				reader.next();
			}
		}

		if (num % 2 == 0) {
			System.out.println("El número " + num + " es par.");
		} else {
			System.out.println("El número " + num + " es inpar.");
		}
	}
}
