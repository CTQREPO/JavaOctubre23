package com;

import java.util.Scanner;

public class Ejercicio14 {
//10 sueldos, mostrar su suma y cuantos hay mayores de $1000

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int suma = 0, sueldo, cont = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite un sueldo: ");
			sueldo = entrada.nextInt();
			suma += sueldo;

			if (sueldo > 1000) {
				cont++;
			}
		}
		System.out.println("La suma de los sueldos es: $"+suma);
		System.out.println("La cantidad de sueldos mayores a $1000 es de "+cont);
	}
}
