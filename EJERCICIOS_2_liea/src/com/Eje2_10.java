package com;

import java.util.Scanner;

public class Eje2_10 {

	public static void main(String[] args) {
		{
	        int fila;
	        int columna;
	        
	        Scanner entrada = new Scanner(System.in);
	        
	      
	        System.out.println("INGRESA NUMERO DE FILAS");
	        fila=entrada.nextInt();
	        System.out.println("INGRESA NUMERO DE COLUMNAS");
	        columna=entrada.nextInt();
	        
	          // Iterar sobre las filas
	        for (int i = 0; i < fila; i++) {
	            // Iterar sobre las columnas
	            for (int j = 0; j < columna; j++) {
	                System.out.print("* "); // Imprimir un asterisco y un espacio en cada celda
	            }
	            System.out.println(); // Moverse a la siguiente fila después de imprimir una fila completa
	        }
	    }
	}
	
	}


