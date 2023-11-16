package com;

import java.util.Arrays;

public class Matrices {
public static void main(String[] args) {
	
	
	
	//Matriz vacia
	String[][] matriz1 = new String[6][5];
	
	//Matriz con valores desde el incio
	String[][] matriz2 = { {"a","b","c"}, 
			               {"d","e","800"},
			                {"=","p","x"}     };
	
	
	matriz1[0][0]= "valor";
	matriz1[0][1]= "esto";
	matriz1[0][2]= "es";
	matriz1[0][3]= "una";
	matriz1[0][4]= "prueba";
	
	matriz1[1][0]= "valor";
	matriz1[1][1]= "valor";
	matriz1[1][2]= "valor";
	matriz1[1][3]= "valor";
	matriz1[1][4]= "valor";
	
	for (int i = 0; i < matriz2.length; i++) {

		//Interar sobre las columnas
		System.out.println(" ");
	for (int j = 0; j < matriz2[i].length; j++) {
		//Aqui se programa lo necesario 
		
		
		//Aqui se porgrama lo necesario para usar los valores de la matriz 
		
		System.out.print(" "+matriz2[i][j]);
	}
	}
}
	//System.out.println(Arrays.deepToString(matriz1));
	

		
	
}

