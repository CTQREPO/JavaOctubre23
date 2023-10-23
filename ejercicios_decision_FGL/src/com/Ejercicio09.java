package com;

import java.util.Scanner;

public class Ejercicio09 {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		int mes = 0;
		int diasMes = 0;
		boolean isnum = false;

		while (!isnum) {
			System.out.print("Ingrese el numero del mes (1-12): ");
			if (reader.hasNextInt()) {
				mes = reader.nextInt();
				isnum = true;
				if (!(mes >= 1 && mes <= 12)) {
					System.out.println("ERROR: Solo se permiten numeros del (1-12) intentelo nuevamente");
					isnum = false;
				}
			} else {
				System.out.println("Porfavor ingrese un numero valido del (1-12)");
				reader.next();
			}
		}

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			diasMes = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diasMes = 30;
			break;
		case 2:
			diasMes = 28;
			break;
		}

		System.out.print("La catidad de dias es: " + diasMes);
	}
}
