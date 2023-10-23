package com;

import java.util.Scanner;

public class EjercicioATS9 {

	//programa que lea 10 numeros y luego los muestre una posicion hacia adelante, el ultimo pasa a ser el primero
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numeros [] = new int [10];
		int guarda;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite un numero: ");
			numeros[i]=entrada.nextInt();
		}
		guarda=numeros[9];
		
		for (int i = 8; i >=0; i--) {
			numeros[i+1]=numeros[i];
		}
		numeros[0]=guarda;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}
