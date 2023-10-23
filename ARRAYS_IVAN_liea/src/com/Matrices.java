package com;

import java.util.Arrays;

public class Matrices {

	public static void main(String[] args) {
		
		String[][] matriz1 = new String[6][5]; //se define matriz y tamaño
		
		matriz1[0][0] = "valor"; //Asignar valor a la celda 0,0
		matriz1[0][1] = "dfg";
		matriz1[0][2] = "vor";
		
		String[][] matriz2= {{"a","b","c"},{"d","e","f"},{"g","h","i"}};
		
	//	System.out.println(Arrays.deepToString(matriz1));
		
		
		for (int i = 0; i < matriz2.length; i++) {//cuenta las filas de la matriz
			System.out.println(Arrays.toString(matriz2[i]));
			for (int j = 0; j < matriz2[i].length; j++) {//cuenta el tamaño de las filas para conocer el numero de colunmas
				//System.out.println(matriz2[i][j]);
				
			}
		}

	}

}
