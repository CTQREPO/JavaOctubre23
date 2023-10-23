package com;

import java.util.Scanner;

public class EjercicioATS21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int cont=0, numero;

		for (int i = 0; i < 10; i++) {

			System.out.println("Digite un numero: ");
			numero = entrada.nextInt();
			
			if(numero<0) {
				cont++;
			}

		}
		if(cont>0) {
		System.out.println("Se introdujeron "+cont+" numeros negativos");
		}
		else {
			System.out.println("No hay numeros negativos proporcionados");
		}
	}
}
