package com;

import java.util.Scanner;

public class Ejercicio12 {
//12.Se ingresan un conjunto de n edades de personas por teclado.
//El programa finalizara cuando el promedio de las edades sea superior a 25.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int edad, suma=0, i=1;
		double promedio;
		do {
			
			System.out.println("Digite la edad de una persona: ");
			edad = entrada.nextInt();
			
			suma+=edad;
					
			promedio = (suma/i);
			i++;
			System.out.println("El promedio de edad es: " + promedio);
		}while(promedio<=25);
		
		
		
	}
}
