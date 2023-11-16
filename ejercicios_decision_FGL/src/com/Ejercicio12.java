package com;

import java.util.Scanner;

public class Ejercicio12 {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		double centroDeSalud = 0;

		System.out.println("  -- Calcular porcentaje de donaciones  --  ");
		System.out.print("  Ingrese la cantidad de pesos donada: ");
		double donacion = reader.nextDouble();

		if (donacion > 10000) {
			centroDeSalud = donacion * 0.3;
		} else {
			
		}
		
		System.out.println("La cantida donada al centro de salud es: $" + centroDeSalud);

	}

}
