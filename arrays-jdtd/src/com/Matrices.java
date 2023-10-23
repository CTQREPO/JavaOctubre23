package com;

import java.util.Arrays;

public class Matrices {
	public static void main(String[] args) {
		
		String [][] matriz1= new String[6][5];
		//matriz con valores desde el inicio
		String [][] matriz2= { {"a","b","c",},
				               {"d","e","800"},
				               {"=","P","x"} };
		matriz1[0][0] ="valor";
		
		//itera sobre filas
		for(int  i=0;i<matriz2.length;i++) {
			for(int j=0;j<matriz2[i].length;j++) {
				//en este punto se programa lo que se quiera hacer dentro de la matriz
				System.out.println(matriz2[i][j]);
				
				
			}
			
		}
		for(int i =0;i<matriz2.length;i++) {
			System.out.println(Arrays.toString(matriz2[i]));
		}
		
		
		
		
		
		//System.out.println(Arrays.deepToString(matriz1));
		
		
		
		
		
		
		
	}

}
