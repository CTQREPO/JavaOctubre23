package com;

import java.util.Scanner;

public class Cuadrado {
	public static void main(String[] args) {
		System.out.println("Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el ancho y el alto.\n"
				+ "***\n"
				+ "***\n"
				+ "***\n");
		System.out.println("Ingrese alto (valores enteros)");
		Scanner teclado = new Scanner (System.in);
		int alto = teclado.nextInt();
		
		while( alto <= 0 ) {
			System.out.println( "ERROR!, el valor debe ser positivo mayor  CERO, intente de nuevo. Ingrese número: ");
			alto= teclado.nextInt();
		}
		
		System.out.println("Ingrese ancho (valores enteros)");

		int ancho = teclado.nextInt();
		
		while( ancho <= 0 ) {
			System.out.println( "ERROR!, el valor debe ser positivo mayor a CERO, intente de nuevo. Ingrese número: ");
			ancho= teclado.nextInt();
		}
		
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		teclado.close();
	}
}
