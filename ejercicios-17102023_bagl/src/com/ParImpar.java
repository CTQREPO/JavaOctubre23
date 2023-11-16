package com;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		System.out.println("Determinar si un número es par o impar ");
		System.out.println("Ingrese un número: ");

		Scanner teclado = new Scanner (System.in);
		int numero = teclado.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("El número ingresado es par");
		}else {
			System.out.println("El número ingresado es impar");
		}
		
	}

}
