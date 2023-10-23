package com;
import java.util.Scanner;
public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String f;
		char l;
		int contador=0;
		String caracter;
		
		
		System.out.println("Introduzca palabra o frase deseado:  ");
		f= scanner.nextLine().toLowerCase();
		System.out.println("Ingresa la letra que desees contar:   ");
		l= scanner.next().charAt(0);
		caracter= f.replaceAll("//s", "");
		
		for (int i = 0; i < f.length(); i++) {
			if(caracter.charAt(i) ==l) {
				contador++;
				
			}
				
		}
	if(contador==0) {
		System.out.println("Caracter no encontrado:   ");
		
	}
	System.out.println(contador);
	
	}
	
}
			


