package com;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
//10. Programa que lea 20 números e indique si son positivos o 
//negativos y pares o impares y ademas muestre la sumatoria de los positivos y sumatoria de los impares.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] numeros = new int[20];
		int sumaPos = 0, sumaNeg = 0;

		for (int j = 0; j < 20; j++) {
			System.out.println("Digite un numero: ");
			numeros[j] = entrada.nextInt();
			if (numeros[j] > 0) {
				sumaPos += numeros[j];
			} else if(numeros[j]<0) {
				sumaNeg += numeros[j];
			}

		}

		for (int i = 0; i < 20; i++) {
			if ((numeros[i] < 0) && (numeros[i] % 2 == 0)) {
				System.out.println("El numero " + numeros[i] + " es negativo y par");
			} else if (numeros[i] > 0 && (numeros[i] % 2 == 0)) {
				System.out.println("El numero " + numeros[i] + " es positivo y par");

			} else if (numeros[i] < 0 && (numeros[i] % 2 != 0)) {
				System.out.println("El numero " + numeros[i] + " es negativo e impar");

			} else if (numeros[i] > 0 && (numeros[i] % 2 > 0)) {
				System.out.println("El numero " + numeros[i] + " es positivo e impar");

			} else if (numeros[i] == 0) {
				System.out.println("El numero " + numeros[i] + " es neutro");

			}

		}
		System.out.println("La cantidad sumatoria de los numeros positivos es igual a: "+sumaPos);
		System.out.println("La cantidad sumatoria de los numeros negativos es igual a: "+sumaNeg);

	}
}