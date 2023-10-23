package com;

import java.util.Scanner;

public class Ejercicio04 {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);

		System.out.print("Ingrese el valor de su calificacion: ");
		int nota = reader.nextInt();
		System.out.print("Ingrese su edad: ");
		int edad = reader.nextInt();
		System.out.print("Ingrese su sexo (H/M): ");
		char sexo = Character.toUpperCase(reader.next().charAt(0));

		if (nota >= 5 && edad >= 18) {
			switch (sexo) {
			case 'H':
				System.out.println("POSIBLE");
				break;
			case 'M':
				System.out.println("ACEPTADA");
				break;
			}
		} else {
			System.out.println("NO ACEPTADA");
		}

	}
}
