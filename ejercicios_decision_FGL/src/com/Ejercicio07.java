package com;

import java.util.Scanner;

public abstract class Ejercicio07 {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);

		System.out.println("   -- Decolver la cara opueta de una dado --   ");
		System.out.print("   -- Paso 1: ingrese un numero del (1-6): ");
		int cara = reader.nextInt();

		String caraOpuesta;

		if (cara >= 1 && cara <= 6) {
			switch (cara) {
			case 1:
				caraOpuesta = "seis";
				break;
			case 2:
				caraOpuesta = "cinco";
				break;
			case 3:
				caraOpuesta = "cuatro";
				break;
			case 4:
				caraOpuesta = "tres";
				break;
			case 5:
				caraOpuesta = "dos";
				break;
			case 6:
				caraOpuesta = "uno";
				break;
			default:
				caraOpuesta = null;
			}

			if (caraOpuesta != null) {
				System.out.println("   -- La cara opuesta es: " + caraOpuesta);
			} else {
				System.out.println("   -- ERROR: numero incorrecto   --  ");
			}
		} else {
			System.out.println("   -- ERROR: numero incorrecto   --  ");
		}
	}

}
