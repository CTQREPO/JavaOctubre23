package com;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
	int a, b;
	System.out.println("Digite un numero: ");
	
	a = entrada.nextInt();
	System.out.println("Digite otro numero: ");
	
	b = entrada.nextInt();
	
	if(a==b) {
		System.out.println(a+" es igual que "+b);
		
	}else if(a>b) {
		System.out.println(a+" es mayor que "+b);
		
	}else if(b>a) {
		System.out.println(b+" es mayor que "+a);
	}
	
	
			
}
}
