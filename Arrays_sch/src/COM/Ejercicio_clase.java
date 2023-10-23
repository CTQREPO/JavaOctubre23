package COM;

import java.util.Arrays;

public class Ejercicio_clase {
	public static void main(String[] args) {
		int[][] aux = new int[4][4];
		int[][] aux2 = new int[4][4];
		String numeros = "1234567890";
		int[][] matriz3 = new int[4][4];
		String[][] matriz1 = { { "2", "x", "x", "1" }, { "x", "1", "2", "x" }, { "x", "1", "2", "x" },
				{ "2", "x", "x", "1" } };
		String[][] matriz2 = { { "1", "o", "o", "2" }, { "o", "2", "1", "o" }, { "o", "2", "2", "o" },
				{ "1", "o", "o", "2" } };
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				if (numeros.indexOf(matriz2[i][j]) >= 0 && numeros.indexOf(matriz1[i][j]) >= 0) {
					aux[i][j] = Integer.parseInt(matriz1[i][j]);
					aux2[i][j] = Integer.parseInt(matriz2[i][j]);
					matriz3[i][j] = aux[i][j] + aux2[i][j];
				}
			}
		}
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println(Arrays.toString(matriz3[i]));
		}
	}

}
