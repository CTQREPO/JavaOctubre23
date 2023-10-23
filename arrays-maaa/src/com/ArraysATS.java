package com;

import java.util.Scanner;

public class ArraysATS {

	public static void main(String[] args) {

		// Arreglos Arrays Vectores de una dimension

		// Definir
		// tipo corchete nombre del array + new tipo cantidad de datos entre corchetes
		//int[] numeros = new int[4];

		// Ingresar datos manualmente
		// numeros[0]=5; esto hara que en la posicion 0 del arreglo llamado "numeros" se
		// situe el valor 5

		// Ingresar datos al crear el arreglo

		//int[] valores = { 5, 7, 9, 12 };

		// Puedes imprimir dato por dato con
		// System.out.println(valores[0]); en este caso imprime el valor 5

		// Para imprimir todos con bucle

		// con este bucle for recorremos la cantidad de posiciones "4" y cada vez se
		// imprime una posicion
		//for (int i = 0; i < 4; i++) {
			//System.out.println(valores[i]);

			// Llenar un arreglo con bucles

			Scanner entrada = new Scanner(System.in);

			int nElementos;

			System.out.println("Digite la cantidad de elementos en el arreglo: ");
			nElementos = entrada.nextInt();

			int[] digitos = new int[nElementos];

			for (int j = 0; j < nElementos; j++) {
				System.out.println("Digite el caracter de la posicion " + j);
				digitos[j] = entrada.nextInt();
			}

			for (int j = 0; j < nElementos; j++) {
				System.out.println(digitos[j]);
			} 
			
			
			
			
			
		}
	}
