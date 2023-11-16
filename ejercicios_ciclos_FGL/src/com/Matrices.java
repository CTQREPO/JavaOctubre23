package com;

public class Matrices {

	public static void main(String[] args) {

		String[][] matriz1 = new String[6][5];
		String[][] matriz2 = { { "a", "b", "c" }, { "d", "e", "800" }, { "=", "p", "x" } };
		matriz1[0][0] = "Valor";
		// System.out.println(Arrays.deepToString(matriz1));

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {

				// Aqui se programa lo nesesario para utilizar los valores de la patriz
				System.out.println(matriz1[i][j]);
			}
		}
		
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println("");
			for (int j = 0; j < matriz2[i].length; j++) {

				// Aqui se programa lo nesesario para utilizar los valores de la patriz
				System.out.print(matriz2[i][j] + ", ");
			}
		}
		
		// tres matrices dos llenas y una vacio hacer el resultado en la segunda matriz
		
		

	}

}
