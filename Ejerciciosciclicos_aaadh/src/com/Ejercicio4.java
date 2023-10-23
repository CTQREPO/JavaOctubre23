//Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje “Carácter no encontrado”.

package com;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una frase:");
		String frase = entrada.nextLine();
		System.out.println("Escribe una letra:");
		char letra = entrada.nextLine().charAt(0);

		int contador = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (letra == frase.charAt(i)) {
				contador++;
			}
		}
		if (contador == 0) {
			System.out.println("Caracter no encontrado");
		} else {
			System.out.println("Se encontraron: " + contador + " letras"+" "+letra +" en la frase");
		}
	}
}
