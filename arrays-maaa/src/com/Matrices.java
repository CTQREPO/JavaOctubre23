package com;

import java.util.Arrays;

public class Matrices {

	
	public static void main(String[] args) {
	
		//Matriz vacia
		String[][] matriz1 = new String[6][5];
		
		//Matriz con valores desde el inicio
		String[][] matriz2 = { {"a", "b","c"}, 
				               {"d", "e", "800"},
				               {"=", "p","x"} };
		
		
		matriz1[0][0] = "valor";
		
		//Iterar sobre filas
		for (int i = 0; i < matriz2.length; i++) {
			//Iterar sobre las columnas
			for (int j = 0; j < matriz2[i].length; j++) {
				
				//Aqui se programa lo necesario para usar los valores de la matriz
					System.out.println(matriz2[i][j]);
			}
			
		}
		//System.out.println(Arrays.deepToString(matriz1));
		

	}
}
