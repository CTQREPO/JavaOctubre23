package com;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String cadena;
		char caracter;
		int contador=0;
		String limpia;
		 
        
		System.out.println("Ingrese una cadena de caracteres: ");
		cadena=sc.nextLine().toLowerCase();
		System.out.println("ingreses la letra que se va a contabilizar");
		caracter=sc.next().charAt(0);
		
		limpia=cadena.replaceAll("//s", "");
		for(int i =0; i<cadena.length();i++) {
			if(limpia.charAt(i)==caracter) {
				contador++;
			}
			}
		
		if(contador==0) {
			System.out.println("Caracter no encontrado");
		}
		
	
		
		System.out.println(contador);
		
}
}