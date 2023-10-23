package com;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		int[] numeros = new int [10];
		
		
		//Ver el valor de una posicion especifica del array

		System.out.println(numeros[3] );
		System.out.println(Arrays.toString(numeros) );

		//Array que le cabe cualquier cosa
		
//		Object[] detodo = new Object[10];
		//Investigar a fondo los arrays
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
	}
}
