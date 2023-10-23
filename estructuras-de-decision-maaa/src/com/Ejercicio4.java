package com;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: 
		 edad, nota y sexo.
* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
* Otros casos -> NO ACEPTADA

		 */
		int nota, edad;
		char sexo;
		
		System.out.println("Proporcione la nota: ");
		nota = entrada.nextInt();
		
		System.out.println("Proporcione la edad: ");
		edad = entrada.nextInt();
		
		System.out.println("Proporcione el sexo (M,F): ");
		sexo = entrada.next().charAt(0);
		
		if(nota>=5 && edad>=18 && sexo=='M') {
			System.out.println("POSIBLE");
		}
		else if(nota>=5 && edad>=18 && sexo=='F') {
			System.out.println("ACEPTADA");
		}
		else {
			System.out.println("NO ACEPTADA");
		}
		
				
		
	}

}
