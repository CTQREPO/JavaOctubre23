//Realiza un programa para determinar si un String es palíndromo.

package com;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		entrada.useDelimiter("\n");

		System.out.println("Escribe una cadena");
		String cadena = entrada.next().toLowerCase();
		String cadenaInvertida = invertirCadena(cadena);
		if (cadena.equals(cadenaInvertida)) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("No es palindromo");
		}
	}

	public static String invertirCadena(String cadena) {

		cadena = cadena.toLowerCase();
		String cadenaInvertida = "";
		char caracter;
		for (int i = cadena.length() - 1; i >= 0; i--) {
			caracter = cadena.charAt(i);
			cadenaInvertida += caracter;
		}
		return cadenaInvertida;
	}
}
