package com;

import java.util.Scanner;

public class EjercicioATS6 {
	//Leer dos arreglos de 12 numeros cada uno, despues mezclarlos 3 y 3 en un tercer arreglo
	
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			int a [] = new int[12];
			int b [] = new int[12];
			int c [] = new int[24];
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
			
			for (int i = 0; i < 12; i++) {
				c[j]=a[i];
				c[j+3]=b[i];
				j++;
				i++;
				c[j]=a[i];
				c[j+3]=b[i];
				j++;
				i++;
				c[j]=a[i];
				c[j+3]=b[i];
				j+=4;
				
			}
			System.out.println("\nDatos del arreglo c");
			for (int i = 0; i < c.length; i++) {
				System.out.println(c[i]);
				
			}
			
		}
}
