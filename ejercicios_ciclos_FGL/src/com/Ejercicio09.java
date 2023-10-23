package com;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio09 {
	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		
		System.out.print("Ingrese el primer numero: ");
		int numUno = reader.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		int numDos = reader.nextInt();

		int mayor = Math.max(numUno, numDos);
		int menor = Math.min(numUno, numDos);
		
		System.out.println("Números en el rango de " + menor + " a " + mayor + ":");
		int cantidadPares = 0;
		for (int i = menor; i <= mayor; i++) {
			if (i % 2 == 0) {
				cantidadPares++;
			}
		}
		
		int[] collection = new int[cantidadPares];

		int j = 0;
		for (int i = menor; i <= mayor; i++) {
			if (i % 2 == 0) {
			collection[j] = i;
				j++;
			}
		}
		System.out.println(Arrays.toString(collection));
	}
}
