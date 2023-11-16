package com;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int D = 0;
		float Peso;

		System.out.println("Destinos disponibles");
		System.out.println("1. America del norte");
		System.out.println("2. America del central");
		System.out.println("3. America del sur");
		System.out.println("4. Europa");
		System.out.println("5. Asia");
		System.out.println("ingrese el destino deseado(1-5): ");
		D = sc.nextInt();
		System.out.println("ingrese el peso de su maleta");
		Peso = sc.nextFloat();

		if (D == 1 && Peso >= 1 && Peso <= 5) {
			System.out.println("el costo de la maleta es:" + Peso * 24.00);
		} else if (D == 2 && Peso >= 1 && Peso <= 5) {
			System.out.println("el costo de la maleta es;" + Peso * 20.00);
		} else if (D == 3 && Peso >= 1 && Peso <= 5) {
			System.out.println("el costo de la maleta es: " + Peso * 21.00);
		} else if (D == 4 && Peso >= 1 && Peso <= 5) {
			System.out.println("el costo de la maleta es: " + Peso * 10.00);
		} else if (D == 5 && Peso >= 1 && Peso <= 5) {
			System.out.println("el costo de la maleta es:" + Peso * 18.00);
		} else {
			System.out.println("Tu maleta exede el peso o la zona es incorrecta");
		}

	}

}
