package com;

import java.util.Scanner;

public class BuscarLetraEnPalabra {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa para detectar cuántas veces se repite una letra en una palabra");
		System.out.println("Ingrese palabra en la que se buscará, distingue mayúsculas de minúsculas");
		String palabra = teclado.nextLine();
		
		System.out.println("Ingrese carácter a buscar");
		char letra = teclado.nextLine().charAt(0);
		
		//palabra = palabra.replace(" ","").toLowerCase();
		int contador = 0;
		for (int i = 0; i < palabra.length() ; i++) {
			if ( letra == palabra.charAt(i)){
				contador ++;
				
			}
		}
		if (contador == 0) {
			System.out.println("Caracter no encontrado");
		}else {
			System.out.println("El caracter se encuentra " + contador + " veces en la palabra");
		}
		
		teclado.close();
	}

}
