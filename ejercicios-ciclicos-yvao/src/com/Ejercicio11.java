package com;

import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		
		int filas=0;
		int columnas=0;
		
		System.out.println("Teclee el numero de filas:");
		filas = a.nextInt();
		System.out.println("Telclee el numero de columnas:");
		columnas =a.nextInt();
		
		for(int i=1; i<filas; i++) {
			
			for(int j=0; j<columnas; j++) {
				
				System.out.print("*");
			}
			
			System.out.println( );
		}
		
	}
}
