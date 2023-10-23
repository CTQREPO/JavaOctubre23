package com;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese palabra para detectar si es pal�ndromo");
		String palabra = teclado.nextLine();
		
		palabra = palabra.replace(" ","").toLowerCase();
		
		String palabraInv = "";
		
		for (int i = palabra.length()-1; i >=  0 ; i--) {
			palabraInv = palabraInv + palabra.charAt(i);
		}
		
		if ( palabra.equals(palabraInv )) {
			System.out.println("Si es pal�ndromo");
		}else {
			System.out.println("No es pal�ndromo");
		}
		teclado.close();
	}

}
