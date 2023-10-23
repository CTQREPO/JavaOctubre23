package com;

import java.util.Scanner;

public class EjercicioATS16 {

	// numero del 0 al 10 y sacar la tabla

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;

		System.out.println("Digite un numero entre 0 y 10: ");

		numero = entrada.nextInt();

		for (int i = 0; i <=10; i++) {
			
			System.out.println(numero+"*"+i+"="+(numero*i));
		}
	}
}
