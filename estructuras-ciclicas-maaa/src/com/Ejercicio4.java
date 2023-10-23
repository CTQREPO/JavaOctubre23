package com;

import java.util.Scanner;

public class Ejercicio4 {
/*
 * 4.Programa que reciba una frase y una letra por teclado.
 *  Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase. 
 *  Si no existe, imprimir un mensaje “Carácter no encontrado”.
 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escriba una frase: ");
		String frase = entrada.nextLine();
		
		System.out.println("Escriba un caracter: ");
		char caracter = entrada.next().charAt(0);
		
		int contador=0;
		
		for (int i = 0; i < frase.length(); i++) {
			
			if(caracter==frase.charAt(i))
				contador++;	
		}
		if(contador==1) {
			System.out.println("El caracter '" + caracter + "' aparece " + contador + " vez en la frase proporcionada");
		}
		else {
			System.out.println("El caracter '" + caracter + "' aparece " + contador + " veces en la frase proporcionada");
		}
		
		
	}
}
