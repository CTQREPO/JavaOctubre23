package com;

import java.util.Arrays;

public class Suma_matriz {
	
		public static void main(String[] args) {
			
			String[][] matriz1 = { {"3","4","r","2"},
								   {"4","2","1","2"},
								   {"r","4","1","3"},
								   {"4","2","1","e"} };
			
			String[][] matriz2 = { {"4","b","6","5"}, 
					               {"e","4","8","6"},
					               {"5","p","8","6"},
					               {"3","4","3","6"} };
			
			String[][] matriz3 = { };
			
			//Matriz 1 
			
			//Interar sobre las filas
		/*	for (int i = 0; i < matriz1.length; i++) {
				
				//Iterar sobre las columnas
				for (int j = 0; j < matriz1[i].length; j++ ) {
				}			
			}  */
			
			for (int i = 0; i < matriz1.length; i++) {
				System.out.println(Arrays.deepToString(matriz1[i]));
			}
				
			
			//Matriz 2
			
			//Interar sobre las filas
		/*	for (int i = 0; i < matriz2.length; i++) {
				
				//Iterar sobre las columnas
				for (int j = 0; j < matriz2[i].length; j++ ) {
				}			
			} */
			
			for (int j = 0; j < matriz2.length; j++) {
				System.out.println(Arrays.deepToString(matriz2[j]));
			}
			
			// Sumar las matrices
	        int[][] matrizSuma = new int[4][4];
	        for (int i = 0; i < matrizSuma.length; i++) {
	            for (int j = 0; j < matrizSuma[i].length; j++) {
	              matrizSuma[i][j] = Integer.parseInt(matriz1[i][j]) + Integer.parseInt(matriz2[i][j]);
	            }
	        }
	        
	        // Imprimir la matriz suma
	        System.out.println("La matriz suma es:");
	        for (int i = 0; i < matrizSuma.length; i++) {
	            for (int j = 0; j < matrizSuma[i].length; j++) {
	                System.out.println(matrizSuma[i][j] + " ");
	            }
	            System.out.println();
	        }
			
		}

	}

/*import java.util.Scanner;
public class SumaDeMatrizConNumeroYLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leer la primera matriz
        System.out.println("Introduzca la primera matriz:");
        int[][] matriz1 = new int[3][3];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }
        // Leer la segunda matriz
        System.out.println("Introduzca la segunda matriz:");
        String[][] matriz2 = new String[3][3];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = scanner.next();
            }
        }
        // Sumar las matrices
        int[][] matrizSuma = new int[3][3];
        for (int i = 0; i < matrizSuma.length; i++) {
            for (int j = 0; j < matrizSuma[i].length; j++) {
                matrizSuma[i][j] = matriz1[i][j] + Integer.parseInt(matriz2[i][j]);
            }
        }
        // Imprimir la matriz suma
        System.out.println("La matriz suma es:");
        for (int i = 0; i < matrizSuma.length; i++) {
            for (int j = 0; j < matrizSuma[i].length; j++) {
                System.out.print(matrizSuma[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/