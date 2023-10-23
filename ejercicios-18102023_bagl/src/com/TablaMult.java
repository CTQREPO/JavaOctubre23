package com;

import java.util.Scanner;

public class TablaMult {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = 0 ;
		int num2 = 0;
		
		System.out.println("Ingresa el primer número a multiplicar");
		num1 = sc.nextInt();
		System.out.println("Iteración deseada");
		num2 = sc.nextInt();
		
		for (int i = 1; i <= num2; i++) {
			System.out.println(num1 + " * "+i + " = " + (num1*i));
		}
		
		System.out.println("¡Terminado!");
		
		sc.close();
		
	}

}
