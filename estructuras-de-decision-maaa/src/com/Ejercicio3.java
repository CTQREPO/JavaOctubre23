package com;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
	/*Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. 
	 Si el segundo n�mero es 0, debe mostrar un mensaje de error.
	 */
	Scanner entrada = new Scanner(System.in);
	int a, b;
	System.out.println("Digite dos numeros enteros: ");
	
	a = entrada.nextInt();
	b = entrada.nextInt();
	
	if(b!=0) {
		System.out.println("La division da como resultado " + (a/b));
	}
	else {
		System.out.println("error");
	}
	
	
}
}
