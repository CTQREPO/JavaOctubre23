package com;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);		
		
		String frase="";
		char letra;
		int contador = 0;
		String frase2;
		
		System.out.println("Ingrese una frase");
		frase = a.nextLine().toLowerCase();
		System.out.println("Ingrese la letra que desea contabilizar ");
		letra = a.next().charAt(0);
		
		frase2=frase.replaceAll("//s",""); //quita los espacios y caracters especiales
		
		for(int i=0; i < frase.length();i++){ //contabiliza la frase
			if(frase2.charAt(i)==letra) {
				contador++;
			}
		}
			if(contador==0) {
				System.out.println("Caracter no encontrado");
			}
			
			System.out.println(contador);
					
			
		
			
	
			
			
			
			
			
			
		
		
		
		
	}
}
