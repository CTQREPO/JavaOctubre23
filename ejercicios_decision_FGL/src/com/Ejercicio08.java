package com;

import java.util.Scanner;

public class Ejercicio08 {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);

		boolean isnum = false;
		int dia = 0;
		
		while (!isnum) {
			System.out.print("Ingrese el numero de la semana: ");
			if (reader.hasNextInt()) {
				dia = reader.nextInt();
				isnum = true;
				if (!(dia >= 1 && dia <= 7)) {
					System.out.println("ERROR: número incorrecto");
					isnum = false;
				} 
			} else {
				System.out.println("Porfavor ingrese un numero valido del 1 - 7");
				reader.next();
			}
		}
		
		switch (dia) {
		case 1:
			System.out.println("LUNES");
			break;
		case 2:
			System.out.println("MARTES");
			break;
		case 3:
			System.out.println("MIERCOLES");
			break;
		case 4:
			System.out.println("JUEVES");
			break;
		case 5:
			System.out.println("VIERNES");
			break;
		case 6:
			System.out.println("SABADO");
			break;
		case 7:
			System.out.println("DOMINGO");
			break;
		}
	}
}
