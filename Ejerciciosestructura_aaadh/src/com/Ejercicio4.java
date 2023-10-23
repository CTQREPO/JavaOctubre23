
//Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//* Otros casos -> NO ACEPTADA

package com;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int nota;
		int edad;
		

		System.out.println("Digite su nota:");
		nota = entrada.nextInt();
		System.out.println("Digite su edad:");
		edad = entrada.nextInt();
		System.out.println("Digite su sexo:");
		entrada.nextLine();
		String sexo = entrada.nextLine();
		
	
		if (nota >= 5 && edad >= 18 && sexo.equals("F")) {
			System.out.println("Aceptada");
		} else if (nota < 5 && edad < 18 && sexo.equals("M")) {
			System.out.println("Posible");
		}

	}
}
