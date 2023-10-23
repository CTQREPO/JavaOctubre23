package com;

import java.util.Scanner;

public class Ejercicio01 {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		
		double num1 = 0;
		double num2 = 0;
		boolean isnum = false;
		
		while (!isnum) {
			System.out.print("Porfavor ingrese el valor del primer numero: ");
			if (reader.hasNextDouble()) {
				num1 = reader.nextDouble();
				isnum = true;
			} else {
				System.out.println("Porfavor ingrese un numero valido");
				reader.next();
			}
		}

		isnum = false;

		while (!isnum) {
			System.out.print("Porfavor ingrese el valor del segundo numero: ");
			if (reader.hasNextDouble()) {
				num2 = reader.nextDouble();
				isnum = true;
			} else {
				System.out.println("Porfavor ingrese un numero valido");
				reader.next();
			}
		}

		if (num1 > num2) {
			System.out.println("El numero " + num1 + " es mayor que el numero " + num2);
		} else if (num1 == num2) {
			System.out.println("El numero " + num1 + " es es igual que el numero " + num2);
		} else {
			System.out.println("El numero " + num1 + " es menor que el numero " + num2);
		}
	}
}
