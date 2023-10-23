package com;

import java.util.Scanner;

public class Ejercicio03 {

	private static Scanner reader;

	public static void main(String[] args) {

		reader = new Scanner(System.in);
		
		System.out.print("Ingrese una cadena de texto: ");
		String mensaje = reader.next();
		
		String mensajeInvertida = new StringBuilder(mensaje).reverse().toString();
		
		if (mensajeInvertida.equals(mensaje)) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("No es palindromo");
		}
	}

}
