package com;

import java.util.Scanner;

public class Ejercicio03 {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		
		System.out.println("   --  validar que el denominador no se 0  --   ");
		System.out.print("   --  Paso 1: ingrese el primer numero: ");
		int numUno = reader.nextInt();
		System.out.print("   --  Paso 2: ingrese el segundo numero: ");
		int numDos = reader.nextInt();
		
		if (numDos != 0) {
			System.out.println("   --  El resultado de la división es: " + (numUno/numDos));
		} else {
            System.out.println("   --  Error: No se puede dividir por cero  --   ");

		}
		
	}
}
