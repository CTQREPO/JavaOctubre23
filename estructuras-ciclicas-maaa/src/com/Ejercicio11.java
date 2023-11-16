package com;

import java.util.Scanner;

public class Ejercicio11 {

	//Establecer base y altura de un cuadrado y dibujarlo con *
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int a, b;
		System.out.println("Digite el alto de la figura: ");
		a=entrada.nextInt();
		System.out.println("Digite el largo de la figura: ");
		b = entrada.nextInt();
		
		String cuadrado [][] = new String [a][b];
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				cuadrado[i][j]="* ";
			}
			
		}
		for (int i = 0; i < a; i++) {
			System.out.print("\n");
			for (int j = 0; j < b; j++) {
				System.out.print(cuadrado[i][j]);
			}
			}
	}
}
