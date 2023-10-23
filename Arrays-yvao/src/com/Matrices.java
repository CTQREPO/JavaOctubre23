package com;

import java.util.Arrays;

public class Matrices {

	public static void main(String[] args) {
		
		//Matriz vacia
		String [][] matriz1 = new String[6][5];
		
		//matriz con valores desde el inicio
		String [][] matriz2 = { {"a","b","c"},
				                {"d","e","800"},
				                {"=","p","x"}   };
		
		matriz1[0][0] = "valor";
		//System.out.println(Arrays.deepToString(matriz1));
		
		//Iterar sobre filas
		for(int i = 0; i < matriz2.length; i++){
			
			for(int j =0; j < matriz2[i].length; j++) {
			
				//aqui se programa lo necesario para usar los valores de la matriz
			//System.out.println(matriz2[i][j]);
			}
			
		}
		for(int i = 0; i < matriz2.length; i++){
		 System.out.println(Arrays.deepToString(matriz2[i]));
		
		}
		
		
	}
}
