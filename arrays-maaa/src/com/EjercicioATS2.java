package com;

import java.util.Scanner;

public class EjercicioATS2 {

	//Solicitar 5 datos, guardarlos en un arreglo y mostrarlos en el orden inverso
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int [] numeros = new int [5];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite un numero: ");
			numeros[i] = entrada.nextInt();
		}
		for (int j = 4; j >= 0; j--) {
			System.out.println(numeros[j]);
		}
	}
}
