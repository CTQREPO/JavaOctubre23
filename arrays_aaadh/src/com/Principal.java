package com;


import java.util.Arrays;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {

		//inicializa un array vacio de 10 posiciones
		int[]numeros = new int [10];
		//ver el valor de una posicion especifica del array
		int[]valores = {2,24,5,7,9,0,5,2,7,45,98};
		//System.out.println(numeros[4]);
		
		System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(valores));
		System.out.println(valores.length);
		
		
		//Array que le cabe calcular cosa
//		Object [] detodo = new Object[10];
//		
//		detodo[0]= "hola";
//		detodo[1]= false;
//		detodo[2]= new Long ("84787673463756345");
//		detodo[3]= 345.23;
//		detodo[4]='k';
//		detodo[5]= new Date();
//		
		for (int i=0;i<numeros.length;i++) {
			numeros [i]=0;
			System.out.println(numeros[i]+200);
		}
		
		
		
				
	}

}
