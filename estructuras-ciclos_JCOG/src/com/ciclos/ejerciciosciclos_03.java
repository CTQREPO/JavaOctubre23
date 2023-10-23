package com.ciclos;

import java.util.Scanner;

public class ejerciciosciclos_03 {
public static void main(String[] args) {
	//3. Realiza un programa para determinar si un String es palíndromo.
	
	Scanner sc = new Scanner(System.in);
	
	String palabra = "alamala";
	
	int inc = 0;
	int des = palabra.length()-1;
	boolean bError = false;		
	
	while ((inc<des) && (!bError)){
		
		if (palabra.charAt(inc)==palabra.charAt(des)){				
			inc++;
			des--;
		} else {
			bError = true;
		}		
	}
	
	if (!bError)
		System.out.println(palabra + " es un PALINDROMO");
	else
		System.out.println(palabra + " NO es un palindromo");
	
}
}
