package com;

import java.util.Scanner;

public class Ejercicio04 {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		
		int total = 0;
		
		System.out.println("     --  Contar la cantiad de veses que hay  un caracter en un texto  --     ");
		System.out.print(" Paso1 - Ingrese su mensaje: ");
		String mensaje = reader.next();
		char[] caracterArray = mensaje.toCharArray();
		System.out.print(" Paso2 - Ingrese el caracter: ");
		char inputCaracter = reader.next().charAt(0);
		
		for (int i = 0; i < caracterArray.length; i++) {
			if (inputCaracter == caracterArray[i]) {
				total = total + 1;
			}
		}
		if (total >= 1) {
			System.out.println("La letra " + inputCaracter + " aparece: " + total + " veses");
		} else {
			System.out.println("  -- Carácter no encontrado  -- ");
		}
	}

}
