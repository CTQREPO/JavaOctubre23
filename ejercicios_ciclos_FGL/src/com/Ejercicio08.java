package com;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio08 {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		System.out.print("Ingrese el primer numero: ");
		int numUno = reader.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		int numDos = reader.nextInt();

		int mayor = Math.max(numUno, numDos);
		int menor = Math.min(numUno, numDos);

		int diferencia = mayor - menor;
		System.out.println("Números en el rango de " + menor + " a " + mayor + ":");
		int[] collection = new int[diferencia + 1];
		

		for (int i = menor; i <= mayor; i++) {
			collection[i-menor] = i;
		}

		System.out.println(Arrays.toString(collection));
	}

}
