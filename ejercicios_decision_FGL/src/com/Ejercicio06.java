package com;

import java.util.Scanner;

public class Ejercicio06 {
	private static Scanner reader;

	public static void main(String[] args) {
		int alumnos = 0;
		boolean isnum = false;
		reader = new Scanner(System.in);

		while (!isnum) {
			System.out.print("Cuantos alumnos son: ");
			if (reader.hasNextDouble()) {
				alumnos = reader.nextInt();
				isnum = true;
			} else {
				System.out.println("Porfavor ingrese un numero valido");
				reader.next();
			}
		}

		if (alumnos >= 100) {
			System.out.println("El costo por cada alumno es de 65 euros");
		} else if (alumnos >= 50 && alumnos < 99) {
			System.out.println("El costo es de 70 euros");
		} else if (alumnos >= 30 && alumnos < 49) {
			System.out.println("El costo es de 95 euros");
		} else {
			System.out.println("El costo de la renta del autobús es de 4000 euros");
		}
	}
}