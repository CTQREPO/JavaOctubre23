package com;

import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
	//Realiza un programa que pida un número por teclado y nos indique si es par o impar.
	Scanner entrada = new Scanner(System.in);
	int numero;
	
	System.out.println("Digite un numero entero: ");
	
	numero = entrada.nextInt();
	
	if(numero%2==0) {
		System.out.println("El numero " + numero + " es par");
	}
	else {
		System.out.println("El numero " + numero + " es impar");
	}
	
}
}
