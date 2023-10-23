package com;

import java.util.Scanner;

public class Problema3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

	
		String cadena;
		String palindromo= "";
	

		System.out.print("Ingrese una cadena: ");
		cadena = scanner.nextLine();
		cadena = cadena.toLowerCase().replaceAll(" ", "");
		
		
		 for (int i = cadena.length()-1; i >=0; i--) {
			palindromo = palindromo+cadena.charAt(i);
		}
		
		if (cadena.equals(palindromo)) {
			System.out.println("Es un palindromo");
		} else {
			System.out.println("No es un aplindromo");

		}
		

		

		
		
		
		
		
		
		
		
	}
}
