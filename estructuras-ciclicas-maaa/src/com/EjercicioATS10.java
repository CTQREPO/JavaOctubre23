package com;

import java.util.Scanner;

public class EjercicioATS10 {
	//suma de 10 numeros proporcionados

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, suma=0;
		
		for (int i = 0; i <10; i++) {
			
			System.out.println("Digite un numero: ");
			
			numero = entrada.nextInt(); 
			suma+=numero;
		}
		System.out.println("La suma de los numeros anteriores es igual a: "+suma);
	}
}
