//Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si introducimos otro número nos da un error.

package com;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner entero = new Scanner(System.in);

		int numerodia;
		String dia = "";

		System.out.println("Día de la semana");
		numerodia = entero.nextInt();
		if (numerodia > 7) {
			System.out.println("Error");
		} else {
			switch (numerodia) {
			default:
				System.out.println("ERROR");
			case 1:
				dia = "lunes";
				break;
			case 2:
				dia = "martes";
				break;
			case 3:
				dia = "miercoles";
				break;
			case 4:
				dia = "jueves";
				break;
			case 5:
				dia = "viernes";
				break;
			case 6:
				dia = "sabado";
				break;
			case 7:
				dia = "domingo";
				break;

			}
			System.out.println("el dia de la semana es: " + dia);

		}
	}
}
