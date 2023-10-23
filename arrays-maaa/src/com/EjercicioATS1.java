package com;

import java.util.Scanner;

public class EjercicioATS1 {

	// Solicita 5 numeros y guardarlos en un arreglo, luego mostrarlos en el mismo
	// orden

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite un numero: ");
			numeros[i] = entrada.nextInt();
		}
		for (int digitos2 : numeros) {
			System.out.println(digitos2);
		}

	}
}
