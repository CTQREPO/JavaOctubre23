package com;

import java.util.Arrays;

public class Ejercicio {

	public static void main(String[] args) {
		
		String [][] matriz1= {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
		String [][] matriz2= {{"1","f","f","1"},{"f","f","f","f"},{"f","f","f","f"},{"f","f","d","f"}};
		int columna=4;
		int fila=4;
		
		int [][] matriz3= new int[fila][columna];
		int [][]m1=new int[fila][columna];
		int [][]m2=new int[fila][columna];
		
		//int array = int new[6];
		String tabla = "1234567890";

		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				
				if(tabla.indexOf(matriz1[i][j])>=0 && tabla.indexOf(matriz2[i][j])>=0) {
					m1[i][j]=Integer.parseInt(matriz1[i][j]);
					m2[i][j]=Integer.parseInt(matriz2[i][j]);
					matriz3[i][j]=m1[i][j]+m2[i][j];
				}
			}
		}

/////////////////////////////////////////////////////////////////////////////////
		for (int i = 0; i < fila; i++) {///// IMPRIME EL RESULTADO
			for (int j = 0; j < columna; j++) {
				System.out.print(matriz3[i][j]+" ");
				
			}
			System.out.println();
	}

}
}