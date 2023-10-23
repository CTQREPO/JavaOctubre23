package com;

import java.util.Scanner;

public class Ejercicio02 {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		System.out.println("   --  Tablas de multiplicar  --   ");
		System.out.print("Paso 1: ingrese en numero a multiplicar: ");
		int numUno = reader.nextInt();
		System.out.print("Paso 2: ingrese en numero de cauntas veses se multiplicara: ");
		int numDos = reader.nextInt();
		
		for (int i = 1; i <= numDos; i++) {
			System.out.println(numUno + " * " + i  + " = " + (numUno * i) );
		}

	}

}
