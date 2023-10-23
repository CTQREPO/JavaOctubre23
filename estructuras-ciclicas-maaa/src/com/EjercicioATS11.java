package com;

import java.util.Scanner;

public class EjercicioATS11 {
//solicitar un numero y obtener su factorial
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite un numero para obtener su factorial");
		int numero = entrada.nextInt();
		long factor=1;
		
		for (int i = 1; i <= numero; i++) {
			factor*=i;
		}
		
		System.out.println("EL resultado factorial del numero "+numero+ " es "+factor);
		
	}
}
