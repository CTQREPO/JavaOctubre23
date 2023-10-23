package com;

import java.util.Scanner;

public class ejercicio_04 {
public static void main(String[] args) {
	/*4.	Realiza un programa que calcule la aceptación de una solicitud en base a 
	 		los siguientes parámetros: edad, nota y sexo.
	 		
	 		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
	 		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
	 		* Otros casos -> NO ACEPTADA*/
	
	
	Scanner sc = new Scanner(System.in);
	
	int nota;
	int edad;
	String sexo;
	
	System.out.println("INNGRESA UNA NOTA: ");
	nota = sc.nextInt();
	System.out.println("INGRESA UNA EDAD: ");
	edad = sc.nextInt();
	System.out.println("INGRESA UN SEXO M / F:");
	sexo = sc.next();
	
	
	if (nota>=5 && edad>=18 && sexo.equals("M")) {
		System.out.println("la solicitud es Posible");
	} else if (nota>=5 && edad>=18 && sexo.equals("F")) {
		System.out.println("la solicitud es ACEPTADA");
	} else {
		System.out.println("NO ACEPTADA");
	}
	
		
}
}