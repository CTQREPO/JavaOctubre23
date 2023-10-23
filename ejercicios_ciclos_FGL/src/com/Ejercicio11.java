package com;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		System.out.print("Ingresa la cantidad de la base: ");
		int a = reader.nextInt();
		System.out.print("Ingresa la cantidad de la la altura: ");
		int b = reader.nextInt();
		
		String[][] cuadro = new String[a][b];
		
		for (int i = 0; i < cuadro.length; i++) {
			for (int j = 0; j < cuadro[i].length; j++) {
				cuadro[i][j] = "*";
			}
		}
		
		System.out.println(Arrays.deepToString(cuadro).replace("],", "],\n"));
	}

}
