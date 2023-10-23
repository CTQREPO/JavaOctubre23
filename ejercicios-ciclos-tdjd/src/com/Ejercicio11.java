package com;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
	 
		Scanner sc= new Scanner(System.in);
		int fila=0;
		int columna=0;
		
		System.out.println("ingrese la cantidad de filas: ");
		fila=sc.nextInt();
		System.out.println("ingrese la cantidad de columnas: ");
		columna=sc.nextInt();
		
		for (int i = 0;i<fila; i++) {
			for(int j=0;j<columna;j++) {
				
				System.out.print("*");
				
				
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
	

}
