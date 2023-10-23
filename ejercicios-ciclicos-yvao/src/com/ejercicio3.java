package com;

import java.util.Scanner;

public class ejercicio3 {
	
		public static void main(String[] args) {
			Scanner a=new Scanner(System.in);
			
		
		String cadena = "";
		String invertida="";
		
		System.out.println("Ingrese la palabra para saber si es palindromo o no");
		cadena = a.nextLine();
		
		for(int i=0; i<cadena.length(); i++) {
			
			invertida = cadena.charAt(i)+invertida;
		}
			
		
		System.out.println("Palabra al reves:" + cadena);
			
			System.out.println("Palabra invertida:" + invertida);
			
			if(cadena.equals(invertida)) {
				 System.out.println("Es es un palindromo"); 
			  }else { 
			   System.out.println("No es un palindromo"); 
			  } 
			}
		}

