package com.ciclos;

import java.util.Scanner;

public class ejerciciosciclos_02 {
	public static void main(String[] args) {
	/*2.- Programa un algoritmo que realice la tabla de multiplicar de 
	un numero introducido desde teclado, hasta la iteración deseada
	por el usuario. Ejemplo, tabla de 23 hasta el 95.
	23 x 95 = ???;*/
	
	Scanner sc = new Scanner(System.in);
	int numero1,numero2;
	
	System.out.println("INGRESA EL PRIMER NUMERO: ");
	numero1 = sc.nextInt();
	
	System.out.println("INGRESA EL SEGUNDO NUMERO: ");
	numero2 = sc.nextInt();
	int resultado = 0;
	
	if (numero1<=0 || numero2 <=0) {
		System.out.println("ERROR");
	}else if(numero1>=0 || numero2<=10) {
		for (int i = 0; i <= numero2;i++) {
			resultado = numero1*i;
			System.out.println(numero1+" por "+i+" es igual a: "+resultado);
		} 
	}
}
}