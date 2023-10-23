package com;

import java.util.Scanner;

public class problema11 {

	 /*public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el ancho del cuadrado: ");
	        int ancho = scanner.nextInt();

	        System.out.print("Ingrese el alto del cuadrado: ");
	        int alto = scanner.nextInt();

	        char[][] cuadrado = new char[alto][ancho];

	        for (int i = 0; i < alto; i++) {
	            for (int j = 0; j < ancho; j++) {
	                if (i == 0 || i == alto - 1 || j == 0 || j == ancho - 1) {
	                    cuadrado[i][j] = '*';
	                } else {
	                    cuadrado[i][j] = ' ';
	                }
	            }
	        }

	        // Imprimir el cuadrado
	        for (int i = 0; i < alto; i++) {
	            for (int j = 0; j < ancho; j++) {
	                System.out.print(cuadrado[i][j] + " ");
	            }
	            System.out.println(); // Salto de línea para la siguiente fila
	        }

	        scanner.close();
	    }*/
public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese valor: ");
		int valor = teclado.nextInt();
		teclado.close();
		
		/*
		 * Usamos dos bucles anidados para crear el cuadrado.
		 * Si pensamos en el cuadrado como una tabla de asteriscos,
		 * el primer bucle crearía las FILAS
		 * y el segundo las COLUMNAS
		 */
		for (int fila = 1; fila <= valor; fila++) {
			for (int columna = 1; columna <= valor; columna++)
				System.out.print("* ");
			
			System.out.println();//Salto de línea para pasar a la siguiente FILA
		}

	}
}
