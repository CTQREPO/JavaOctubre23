package com;

import java.util.Date;
import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
		// inicialisa un array vacio de 10 posiciones
		int[] numeros = new int [10];
		int[] valores = {1,2,3,4,5,6,7,8,9,113};
		String[] objetos = new String[10];
		
		numeros[0] = 120;
		numeros[1] = 45;
		numeros[2] = 120;
		numeros[3] = 45;
		numeros[4] = 120;
		numeros[5] = 45;
		numeros[6] = 120;
		numeros[7] = 45;
		numeros[8] = 120;
		numeros[9] = 45;
		
		objetos[1] ="hola";
		
		
		for(int i =0; i<objetos.length;i++) {
			//System.out.println(numeros[i]+200);
			objetos[i] = null;
		}
		
		
		
		
		
//		// ver el valor de una posicion especifica del array
		System.out.println(numeros[4]);
		
		
		System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(valores));
		System.out.println(valores.length);
		
		
		//array que le cabe cualquier cosa
		Object[] detodo = new Object[10];
		
		detodo[0] ="hola";
		detodo[1] =	false;
		detodo[2] = 8541268425698L;
		detodo[3] = 345.2;
		detodo[4] = 'k';
		detodo[5] = new Date();
		
		System.out.println(Arrays.toString(detodo));
		System.out.println(Arrays.toString(objetos));


		
 		
		

		
		
	}

}
