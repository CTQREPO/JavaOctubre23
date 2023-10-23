package com;

public class EjercicioEnClaseMatrices {

	public static void main(String[] args) {

		String[][] matrix_1 = { { "1", "f", "3" }, { "4", "4", "g" }, { "9", "d", "2" } };
		String[][] matrix_2 = { { "9", "d", "f" }, { "4", "4", "g" }, { "1", "f", "9" } };
		int[][] matrix_F = new int[3][3];
		int numM1 = 0;
		int numM2 = 0;

		String numeros = "0123456789";

		for (int i = 0; i < matrix_1.length; i++) {
			for (int j = 0; j < matrix_1[i].length; j++) {

				if (numeros.indexOf(matrix_1[i][j]) >= 0) {
					numM1 = Integer.parseInt(matrix_1[i][j]);

					if (numeros.indexOf(matrix_2[i][j]) >= 0) {
						numM2 = Integer.parseInt(matrix_2[i][j]);

						matrix_F[i][j] = numM1 + numM2;
					}
				} else {
					matrix_F[i][j] = 0;
				}
			}
		}

		// _-------------------Impresión de Matriz -------------------------------------

		for (int i = 0; i < matrix_1.length; i++) {
			if (i == 1) {
				
			
			System.out.print("[");
			for (int j = 0; j < matrix_1[i].length; j++) {
				System.out.print(matrix_1[i][j] + " ");
			}
			System.out.print("]");
			System.out.print("   +   [");
			for (int j = 0; j < matrix_2[i].length; j++) {
				System.out.print(matrix_2[i][j] + " ");
			}
			System.out.print("]");
			System.out.print("   =   [");
			for (int j = 0; j < matrix_F[i].length; j++) {
				System.out.print(matrix_F[i][j] + " ");
			}
			System.out.println("]");
			}else {
				System.out.print("[");
				for (int j = 0; j < matrix_1[i].length; j++) {
					System.out.print(matrix_1[i][j] + " ");
				}
				System.out.print("]");
				System.out.print("       [");
				for (int j = 0; j < matrix_2[i].length; j++) {
					System.out.print(matrix_2[i][j] + " ");
				}
				System.out.print("]");
				System.out.print("       [");
				for (int j = 0; j < matrix_F[i].length; j++) {
					System.out.print(matrix_F[i][j] + " ");
				}
				System.out.println("]");
			}
				
			}

	}
}
