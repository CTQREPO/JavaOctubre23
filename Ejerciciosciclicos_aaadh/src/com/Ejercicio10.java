//Programa que lea 20 números e indique si son positivos o negativos y pares o impares y además muestre la sumatoria de los positivos y sumatoria de los impares.

package com;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num = 0;
		double positivos = 0;
		double impares = 0;
		double negativos = 0;
		double pares = 0;

		for (int i = 0; i < 20; i++) {
			System.out.println("Digite un numero:");
			num = entrada.nextDouble();
			if (num > 0) {
				positivos = positivos + num;
			} else {
				negativos = num;
			}
			if (num % 2 == 0) {
				pares = num;
			} else {
				impares = impares + num;
			}
		}
		System.out.println("Numeros positivos son: " + (positivos - negativos));
		System.out.println("Numeros negativos son:" + (negativos - positivos));
		System.out.println("Numeros pares son:" + (pares - impares));
		System.out.println("Numeros impares son: " + (impares - pares));
		System.out.println("La suma de los numeros positivos es: " + positivos);
		System.out.println("La suma de los numeros impares es: " + impares);
	}
}