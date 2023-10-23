package com;

import java.util.Arrays;
import java.util.Date;

public class arrays {
	public static void main(String[] args) {
		
		//inicializa un array vacio de 10 posiciones
		int [] numeros = new int [10];
		int [] valores = {1,2,3,4,5,6,7,8,9,10,11,12};
		String[] objetos = new String [10];
		
		numeros [0] = 100;
		numeros [1] = 200;
		numeros [2] = 300;
		numeros [3] = 400;
		numeros [4] = 500;
		numeros [5] = 600;
		numeros [6] = 700;
		numeros [7] = 800;
		numeros [8] = 900;
		numeros [9] = 1000;	
		
		for (int i = 0; i < numeros.length; i++) {
			//System.out.println(numeros[i]+200); //suma el valor de los numeros iniciales + 200
			
		}
		
		
		
		//ver el valor de una posicion especifica del array
		System.out.println(numeros[4]);
		System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(valores));
		System.out.println(valores.length);
		
		//array que le cabe cualquier cosa
		Object[] detodo =new Object[10];
		
		detodo [0] = "hola";
		detodo [1] = false;
		detodo [2] = new Long ("3234213265645");
		detodo [3] = 234.43;
		detodo [4] = 'k';
		detodo [5] = new Date(); //importar java.util.Date;
		
		System.out.println(Arrays.toString(detodo));
		System.out.println(Arrays.toString(objetos));
		
				
		
	}

}
