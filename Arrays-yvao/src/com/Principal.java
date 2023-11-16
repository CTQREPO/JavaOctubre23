package com;

import java.util.Arrays;
import java.util.Date;


public class Principal {
 public static void main(String[] args) {
	
	 	//inicializa un array vacio de 10 posiciones
	 int[] numeros = new int[10];
	 int[] valores = {1,5,2,8,5,3,8,9,3,2,6,8,3456};
	 String[] objetos = new String[10];
	 
	 numeros[0] = 800;
	 numeros[1] = 47;
	 numeros[2] = 458;
	 numeros[3] = 47;
	 numeros[4] = 422;
	 numeros[5] = 47;
	 numeros[6] = 8425;
	 numeros[7] = 47;
	 numeros[8] = 253;
	 numeros[9] = 125;
	 
	 // se puede ver cada valor individualmente
	for(int i = 0; i < numeros.length; i++) {
	   
	//	System.out.println(numeros[i]+200);
		
		
		//vaciar el array
		numeros[i] = 0;
	}
	 
	 
	 
	 
	 
	 
	 
	 // ver el numero de una posicion especifica del array
	 
	// System.out.println(numeros[4]);
	 System.out.println(Arrays.toString(numeros));
	 System.out.println(Arrays.toString(valores));
	 System.out.println(valores.length);
	 
	 
	 //Array que le cabe cualquier cosa
	 
	 Object[] detodo = new Object[10];
	 
	 detodo[0] = "hola";
	 detodo[1] = false;
	 detodo[2] = new Long("405824555641");
	 detodo[3] = 345.2;
	 detodo[4] = 'K';
	 detodo[5] = new Date();
	 System.out.println(Arrays.toString(detodo));
	 System.out.println(Arrays.toString(objetos));
}
 
 
}
