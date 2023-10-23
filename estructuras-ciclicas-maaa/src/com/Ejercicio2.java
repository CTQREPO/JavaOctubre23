package com;

import java.util.Scanner;

public class Ejercicio2 {
//	2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado,
//hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???;
	
	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		int numero, veces;
		
		System.out.println("Digite el numero a multiplicar");
		numero = entrada.nextInt();
		System.out.println("Digite el numero de veces a multiplicar");
		veces = entrada.nextInt();
		
		for (int i = 0; i < veces; i++) {
			
			System.out.println(numero + "*" + i + "=" + (numero*i));
		}
	}

}
