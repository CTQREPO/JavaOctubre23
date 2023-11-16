package com;

import java.util.Arrays;
import java.util.Date;

public class Principal {
	
	public static void main(String[] args) {

///////INICIA UN ARRAY VACIO DE 10 POSICIONES///////////////
	
	int[] numeros = new int[10];
	int[] valores = {1,2,3,4,5,6,7,8,9,0};
	
	numeros[0]=12;
	numeros[4]=2;
	
////////VER EL VALOR DE UNA POSICION ESPECIFICA/////////////////////
	
	System.out.println(numeros[4]);
	
	System.out.println(Arrays.toString(numeros));
	
	System.out.println(Arrays.toString(valores));
	
	System.out.println(valores.length);
	
/////////////ARRAY DE TODO UN POCO//////////////////////////////////
	Object[] detodo = new Object[10]; //SE CREO UNA CLASE
	
	detodo[0]= "ghj";
	detodo[2]= 2.234;
	detodo[3]= 2;
	detodo[5]= 'e';
	detodo[7]= new Date();
System.out.println(Arrays.toString(detodo));


////////////LEE TODO LOS VALORES DEL ARRAY INDIVIDUALMENTE//////////////////////////////////////////
for (int i = 0; i < numeros.length; i++) {
	System.out.println(numeros[i]);
}
	}
	
}
