package com;

import java.util.Scanner;

public class ProgramaPositivosNegParImp {

	public static void main(String[] args) {

		System.out.println("Programa que lea 20 números e indique si son positivos o negativos y pares o impares y ademas muestre la sumatoria de los positivos y sumatoria de los impares.");
		
		Scanner teclado = new Scanner (System.in);
		double num = 0;
		double sumaPos = 0;
		double sumaImp = 0;
		
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Ingrese un número");
			num = teclado.nextDouble();
			if (num % 2 == 0) {
				System.out.println("El número es par");
			}else {
				System.out.println("El número es impar");
				sumaImp = sumaImp + num;
			}
			if (num < 0) {
				System.out.println("El número es negativo");
			}else {
				System.out.println("El número es positivo");
				sumaPos = sumaPos + num;
			}
		
		}
		System.out.println("La sumatoria de los números positivos es: " + sumaPos);
		System.out.println("La sumatoria de los números impares es: " + sumaImp);
		
	}

}
