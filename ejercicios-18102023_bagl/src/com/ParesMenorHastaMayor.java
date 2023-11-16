package com;

import java.util.Scanner;

public class ParesMenorHastaMayor {

	public static void main(String[] args) {

		

		System.out.println("Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos");
		System.out.println("Ingrese el primer n�mero entero");
		Scanner teclado = new Scanner (System.in);
		int num1 = teclado.nextInt();
		
		System.out.println("Ingrese el segundo n�mero entero");
		int num2= teclado.nextInt();
		
		while( num1 == num2 ) {
			System.out.println( "ERROR!, los n�meros deben ser diferentes, intente de nuevo. Ingrese n�mero: ");
			num2= teclado.nextInt();
		}
		
		
		int menor = 0, mayor = 0;
		
		if( num1 < num2 ) {
			menor = num1;
			mayor = num2;
		}else if( num2 < num1 ) {
			menor = num2;
			mayor = num1;
		}
		System.out.println("Los n�meros que se encuentran entre los n�meros ingresados son: ");
		for (int i = menor; i <= mayor ; i ++) {
			if ( i % 2 == 0 ) {
				System.out.println(i);
			}
		}
		teclado.close();
	}

}
