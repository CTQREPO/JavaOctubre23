package com;

import java.util.Scanner;

public class Ejercicio1 {
	//1.- Programa un algoritmo que realice la tabla de multiplicar del 12
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int veces;
		
		System.out.println("Digite el numero de veces a multiplicar");
		veces = entrada.nextInt();
		
		for (int i = 0; i < veces; i++) {
			
			System.out.println(12 + "*" + i + "=" + (12*i));
		}
	}
}
