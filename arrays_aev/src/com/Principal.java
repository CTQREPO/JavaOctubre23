package com;

import java.util.Arrays;
import java.util.Date;

public class Principal {
	public static void main(String[] args) {
		
		//Inicializa un array vacio de 10 posiciones
		int[] numeros = new int[10];
		int[] valores = {3,56,21,3,4,52,57,2,34,5,6,2,3,444,323,4565};
		
		numeros[0] = 800;
		numeros[1] = 23;
		numeros[2] = 34;
		numeros[3] = 345;
		numeros[4] = 26;
		numeros[5] = 86;
		numeros[6] = 98;
		numeros[7] = 45;
		numeros[8] = 65;
		numeros[9] = 346;
		
		
		for (int i = 0; i < numeros.length; i++) {
			
			//System.out.println(numeros[i]+200);
			
			
		}
		
		
		
		
		//ver el valor de una posicion especifica del array
		//System.out.println(numeros[7]);
		System.out.println(Arrays.toString(valores));
		System.out.println(Arrays.toString(numeros));
		System.out.println(valores.length); //length(): 
											//length:
		
		
		//Array que le cabe cualquier cosa
		Object[] detodo = new Object[10];
		
		detodo[0] = "Hola";
		detodo[1] = false;
		detodo[2] = new Long("23434645542342");
		detodo[3] = 34.65;
		detodo[4] = 'k';
		detodo[5] = new Date();
		System.out.println(Arrays.toString(detodo));
		
		
		
		
	}
}
