package com;

import java.util.Scanner;

public class EjercicioATS4 {

	//pedir 10 numeros, meterlos en un arreglo, luego mostrar el primero, el ultimos, segundo, penultimo...
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numeros[] = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite un numero: ");
			numeros[i]= entrada.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(numeros[i]);
			System.out.println(numeros[9-i]);
		}
	}
}
