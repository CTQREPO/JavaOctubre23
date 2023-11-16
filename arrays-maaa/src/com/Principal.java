package com;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		//Inicializa un array vacio de 10 posiciones
		
		int[] numeros = new int[10];
		
		//Iniciar un array con valores
		int[] valores = {1,4,6,7,58,6453};		
		
		//asignar valor a una posicion
				numeros[0] = 800;
				numeros[1] = 42;
				numeros[2] = 800;
				numeros[3] = 426;
				numeros[4] = 8004;
				numeros[5] = 482;
				numeros[6] = 8060;
				numeros[7] = 427;
				numeros[8] = 8400;
				numeros[9] = 142;
				
				for (int i = 0; i < numeros.length; i++) {
					System.out.println(numeros[i]);
				}
				
		//Ver el valor de  una posicion especifica del array
		System.out.println(numeros[7]);
		System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(valores));
		System.out.println(valores.length);
		
		//Array que le cabe cualquier cosa
		Object[] detodo = new Object[10];
		
		detodo[0] = "hola";
		detodo[1] = 19342;
		detodo[2] = 'c';
		
		
	}
}
