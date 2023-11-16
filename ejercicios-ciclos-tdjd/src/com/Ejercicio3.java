package com;
import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String cadena="";
		String cadenainvertida="";
		String limpia;
				
		System.out.println("ingrese la palabra a comprobar si es palindromo o  no");
		cadena = sc.nextLine().toLowerCase();
		System.out.println("palabra original: "+cadena);
		limpia=cadena.replaceAll("//s", "");
		for(int i= 0; i<cadena.length();i++) {
			
			cadenainvertida = limpia.charAt(i) + cadenainvertida;
			
			}
		
		System.out.println("palabra al reves: "+ cadenainvertida);
		
		if(limpia.equals(cadenainvertida)) {
			System.out.println("es es un palindromo");
		}else {
			System.out.println("no es un palindromo");
		}
		
		
		
		
		
		
		
		
	}

}
