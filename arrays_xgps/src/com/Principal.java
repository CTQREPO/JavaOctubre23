package com;

import java.util.Arrays;
import java.util.Date;
public class Principal {
	public static void main(String[] args) {
		
		//Inicializa un array vacio de 10 posiciones
		int[] numeros = new int [10];
		int[] valores = {1,2,3,4,5,6,7,8,3456};
		String[] Object = new String[10];
		
		numeros[0]=800;
		numeros[1]=47;
		numeros[2]=453;
		numeros[3]=470;
		numeros[4]=45;
		numeros[5]=37;
		numeros[6]=57;
		numeros[7]=87;
		numeros[8]=7;
		numeros[9]=17;
		
				
		
		for (int i = 0; i < numeros.length; i++) {
//			System.out.println(numeros[i]+200); // imprimir posicion
		numeros[i] = 0;
		
		}
		
		
		
				
		//Ver el valor de una posicion especifica del array 
		//System.out.println(numeros[4]);
		
				
		
		//Ver el valor de una posicion especifica del array 
		System.out.println(Arrays.toString(numeros)); //que valor tienen los primitivos y los objetos
		System.out.println(Arrays.toString(valores));
		System.out.println(valores.length);
		
		
		//Array que le cabe cualquier cosa
		Object[] detodo = new Object[10];
		
		detodo[0] = "Hola";
		detodo[1] = false;
		detodo[2] = new Long("8939383883992828");
		detodo[3] = 345.2;
		detodo[4] = 'K';
		detodo[5] = new Date(); //para fechas
		System.out.println(Arrays.toString(detodo));
		System.out.println(Arrays.toString(Object));
		
	}

}
