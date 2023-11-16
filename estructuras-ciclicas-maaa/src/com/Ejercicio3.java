package com;

import java.util.Scanner;

public class Ejercicio3 {

	//3. Realiza un programa para determinar si un String es palíndromo
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una cadena: ");
		
	String frase = entrada.next().toLowerCase();
	
	StringBuilder stringBuilder = new StringBuilder(frase);
	
	String invertido = stringBuilder.reverse().toString();
		
	
	if(invertido.equals(frase)) {
		System.out.println("La cadena proporcionada es un palindromo");
	}
	else {
		System.out.println("La cadena proporcionada NO es un palindromo");
	}
	}
}
