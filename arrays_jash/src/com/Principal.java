package com;

import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
		//inicia una array vacio de 10 pocisiones
		int [] numeros = new int[10];
		int[] valores = {10,23,334,454,45,33};
		
		numeros[0] =4567;
		numeros[1] =8765;
		numeros[2] =7987;
		numeros[3] =104667;
		numeros[4] =100;
		numeros[5] =176;
		numeros[6] =18765;
		numeros[7] =987;
		numeros[8] =135;
		numeros[9] =324;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]+200);
		}
		
		//ver el valor de una posicion especifica de array
		System.out.println(numeros[7]);
		
		System.out.println(Arrays.toString(numeros));
		
		System.out.println(Arrays.toString(valores));
		
		System.out.println(valores.length);
		
		//array que cabe cualquier cosa
		Object[] detodo = new Object[10];
		
		detodo[0] ="hola";
		detodo[1] = false;
		detodo[2] ="hola";
		detodo[3] = 2345678;
		detodo[4] ="1234566";
		detodo[5] = 222.34;
		detodo[6] ="hola";
		detodo[7] = false;
		detodo[8] ="hola";
		detodo[9] = false;
		System.out.println(Arrays.toString(detodo));
	}
}
//los valores primitivos enteros es 0
//los valores float double char boolean son valores primitivos
//los objetos siempre tienen un valor null