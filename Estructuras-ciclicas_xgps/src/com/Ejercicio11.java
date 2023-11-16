package com;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Teclee el ancho");
		int filas= scanner.nextInt();
		System.out.println("Teclee el alto");
		int columnas= scanner.nextInt();
		
		for(int i=1; i<=filas;i++) {
			System.out.println();
			for(int j=1; j<=columnas;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}	
	}


