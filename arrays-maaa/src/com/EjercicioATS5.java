package com;

import java.util.Scanner;

public class EjercicioATS5 {

	//Leer dos arreglos de 10 numeros cada uno, despues mezclarlos 1 y 1 en un tercer arreglo
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a [] = new int[10];
		int b [] = new int[10];
		int c [] = new int[20];
		int j=0;
		
		System.out.println("Datos del arreglo a");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite un numero: ");
			a[i]=entrada.nextInt();
		}
		System.out.println("\nDatos del arreglo b");
		for (int i = 0; i < b.length; i++) {
			System.out.println("Digite un numero: ");
			b[i]=entrada.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			c[j]=a[i];
			j++;
			c[j]=b[i];
			j++;
		}
		System.out.println("\nDatos del arreglo c");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
			
		}
		
	}
}
