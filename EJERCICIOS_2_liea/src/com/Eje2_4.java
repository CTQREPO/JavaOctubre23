package com;

import java.util.Scanner;

public class Eje2_4 {

	public static void main(String[] args) {
		String frase;
		String letra;
		String letramini;
		String limpia;
		int contador = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ESCRIBE UNA FRASE Y UNA LETRA PARA SABER UANTAS VECES SE REPITE");
		
		System.out.println("ESCRIBE UNA FRASE");
		frase=entrada.nextLine();
		
		System.out.println("TECLEA LA LETRA");
		letra=entrada.nextLine();
		
		limpia = frase.replaceAll("\\s+", "").toLowerCase();
		
		letramini=letra.toLowerCase();
		
		for (int i = 0; i < limpia.length(); i++) {
			if(limpia.charAt(i) == letramini.charAt(0)) {
				contador++;
			}
		}
		System.out.println("La letra "+letra+" se repite "+contador);
		if(contador==0) {
			System.out.println("CARACTER NO ENCONTRADO");
		}

	}

}
