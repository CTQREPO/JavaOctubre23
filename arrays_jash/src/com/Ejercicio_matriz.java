package com;

import java.util.Arrays;

public class Ejercicio_matriz {
	public static void main(String[] args) {
		
		String[][] matriz1 = {{"1","2","3","4"},{"a","b","c","d"},{"6","7","8","9"},{"a","b","c","d"}};
		String[][] matriz2 = {{"1","2","3","4"},{"5","6","7","8"},{"4","3","2","1"},{"1","2","3","4"}};
		String[][] matriz3 = new String[4][4];
		
		String num ="12345667890";
		
		int valor1,valor2;
		
		for (int k = 0; k < matriz3.length; k++) {
			for (int l = 0; l < matriz3[k].length; l++) {

				if(num.indexOf(matriz1[k][l])>=0 && num.indexOf(matriz2[k][l])>=0) {
					
					valor1 = Integer.parseInt(matriz1[k][l]);
					valor2 = Integer.parseInt(matriz2[k][l]);
					int valor = valor1+valor2;
					matriz3[k][l]=String.valueOf(valor);
				}else {

					matriz3[k][l]="0";
				}

				}
		}
		System.out.println(Arrays.deepToString(matriz1));
		System.out.println(Arrays.deepToString(matriz2));
		System.out.println("RESULTADO");
		System.out.println(Arrays.deepToString(matriz3));
		
	}
}
