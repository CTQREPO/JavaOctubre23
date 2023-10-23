package com;

import java.util.Arrays;

public class SumaDeMatrices {

	public static void main(String[] args) {
		String[][] matriz1 = { { "f", "5", "l" }, { "4", "9", "1" }, { "g", "t", "1" } };
		String[][] matriz2 = { { "1", "7", "k" }, { "7", "t", "1" }, { "k", "1", "7" } };
		String[][] matriz3 = new String[3][3];
		String numeros = "1234567890";

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				char caracter1 = matriz1[i][j].charAt(0);
				char caracter2 = matriz2[i][j].charAt(0);
				if(numeros.indexOf(caracter1) >= 0 && numeros.indexOf(caracter2) >= 0) {
					int numeroMatriz1 = Character.getNumericValue(caracter1);
					int numeroMatriz2 = Character.getNumericValue(caracter2);
					matriz3[i][j] = String.valueOf(numeroMatriz2 + numeroMatriz1);
				} else {
					matriz3[i][j] = "0";
				}
			}
		}
		System.out.println(Arrays.deepToString(matriz3).replace("],", "],\n").replace("]]", "]").replace("[[", "[" ).replace("],", "]" ).replace(" [", "[" ));
	}
}
