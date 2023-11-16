package com;

import java.util.Scanner;

public class ejercicio_02 {
	public static void main(String[] args) {
		//2. Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("ingrese un numero entero");
		
		int numero = sc.nextInt();
		int residuo = numero % 2;
		if (residuo == 0) {
		System.out.println("el numero es par");
		}else {
			System.out.println("el numero es impar");
		}
	}
}