package com;

import java.util.Scanner;

public class Principal_datos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); // SIRVE PARA ESCANEAR DATOS QUE EL USUARIO VA A INGRESAR
		
		float num; // SOLO SE DECLARA INT EL USUARIO ASIGNA VALOR (float, int double)
		
		System.out.println("DIGITE UN NUMERO"); // EL PROGRAMA PIDE EL NUMERO
		num = entrada.nextFloat();// EL PROGRAMA GUARDA EL NUMERO EN LA VARIABLE ENTRADA
		
		System.out.println("EL NUMERO ES "+num); // IMPRIME EL NUMERO DADO POR EL USUARIO
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		Scanner texto = new Scanner(System.in); // SIRVE PARA ESCANEAR DATOS QUE EL USUARIO VA A INGRESAR
	
		String cadena; 
		
		System.out.println("ESCRIBA UNA FRASE"); // EL PROGRAMA PIDE UNA FRASE
		cadena = texto.nextLine();// EL PROGRAMA GUARDA LA FRASE EN LA VARIABLE CADENA
		
		System.out.println("EL TEXTO ES "+cadena);
	
	}
}
