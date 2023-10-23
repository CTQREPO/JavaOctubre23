package com;

import java.util.Arrays;

public class ejercicio_matrices {
public static void main(String[] args) {
	
	String[][] matriz1 = { {"2","m","4","p"},{"r","e","2","9"},{"2","4","4","2"},{"0","m","4","p"} };
	String[][] matriz2 = { {"3","7","4","0"},{"t","e","x","9"},{"3","3","1","2"},{"0","m","x","p"} };
	String[][] matriz3 = new String [4][4];
	
	String numeros= "1234567890";
	int valor1,valor2;
	
	
	 for (int i = 0; i < matriz3.length; i++) {
		for (int j = 0; j < matriz3[i].length; j++) {
			
			if(numeros.indexOf(matriz1[i][j])>=0 && numeros.indexOf(matriz2[i][j])>=0) {
			valor1 = Integer.parseInt(matriz1[i][j]);
			valor2 = Integer.parseInt(matriz2[i][j]);
			int valor = valor1+valor2;
			matriz3[i][j] = String.valueOf(valor);
		}else {
			matriz3[i][j] = "0";
		}
	}
 }
	 System.out.println(Arrays.deepToString(matriz1));
	 System.out.println(Arrays.deepToString(matriz2));
	 System.out.println("resultado");
	 System.out.println(Arrays.deepToString(matriz3));
	 
}
}