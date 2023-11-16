package com;

import java.util.Arrays;

public class Sumadematriz {
	public static void main(String[] args) {

		String[][] matriz1 = { { "1", "a", "7", "4" }, { "4", "6", "8", "4" }, { "7", "2", "a", "8" },
				{ "1", "4", "5", "3" } };

		String[][] matriz2 = { { "0", "2", "3", "0" }, { "2", "a", "7", "4" }, { "1", "5", "7", "4" },
				{ "1", "4", "5", "3" } };

		int[][] matriz3 = new int[4][4];
		int cont[][] = new int[4][4];
		int cont2[][] = new int[4][4];
		int numEntero[][] = new int[4][4];
		int numEntero2[][] = new int[4][4];
		String numero = "1234567890";

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {

				if (numero.indexOf(matriz1[i][j]) >= 0 && numero.indexOf(matriz2[i][j]) >= 0) {// metodo index
																								// of(devuelve el valor
																								// del incide
					numEntero[i][j] = Integer.parseInt(matriz1[i][j]);

					numEntero2[i][j] = Integer.parseInt(matriz2[i][j]); // parseInt es para conversion de datos
					matriz3[i][j] = numEntero[i][j] + numEntero2[i][j];

				}
			}

		}

		for (int i = 0; i < matriz3.length; i++) {
			System.out.println(Arrays.toString(matriz3[i]));
		}

	}
}