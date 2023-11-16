package com;

import java.util.Arrays;

public class EjercicioMatriz {

	public static <matriz2, matriz1> void main(String[] args) {
		String[][] matriz1 = { { "2", "5", "8" }, { "0", "e", "2" }, { "=", "1", "4" } };
		String[][] matriz2 = { { "1", "0", "7" }, { "f", "6", "9", }, { "1", "3", "2" } };
		String[][] suma = new String[3][3];
		String aux = "";
		int num1 = 0;
		String numeros = "1234567890";
		String lugares = "";
		int num2 = 0;

		System.out.println(Arrays.deepToString(matriz1));
		System.out.println(Arrays.deepToString(matriz2));

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {

				// Hacer un if para comprobar si es un numero
				if (numeros.indexOf(matriz1[i][j]) >= 0 && numeros.indexOf(matriz2[i][j]) >= 0) {
					num1 = Integer.parseInt(matriz1[i][j]);
					num2 = Integer.parseInt(matriz1[i][j]);

					int matriz4 = Integer.parseInt(matriz1[i][j]);
					int matriz5 = Integer.parseInt(matriz2[i][j]);
					int matrizresuelta1 = matriz4 + matriz5;
				}
			}
			for (int j = 0; j < matriz1.length; j++) {
				System.out.println("[ " + matriz1[i][j] + " ]");

			}
			if (i == 1) {
				System.out.println("   +   ");
			} else {
				System.out.println("      ");
			}

			for (int j = 0; j < matriz2.length; j++) {
				System.out.println("[ " + matriz2[i][j] + " ]");

			}
			if (i == 1) {
				System.out.println("   =  ");
			} else {
				System.out.println("      ");
			}

			for (int j = 0; j < suma.length; j++) {
				System.out.println("[ " + suma[i][j] + " ]");
			}
			System.out.println("");
		}

			System.out.println(suma[i][j]);
			System.out.println(matriz1[i][j]);
			System.out.println(matriz2[i][j]);
	}

}
