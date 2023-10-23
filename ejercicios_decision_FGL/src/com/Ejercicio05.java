package com;

import java.util.Scanner;

public class Ejercicio05 {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		double precioFinal;

		System.out.print("Ingrese el precio inicial por kilo de uva: ");
		double precioInicial = reader.nextDouble();

		System.out.print("Ingrese el tipo de uva (A o B): ");
		char tipoUva = Character.toUpperCase(reader.next().charAt(0));

		System.out.print("Ingrese el tamaño de la uva (1 o 2): ");
		int tamUva = reader.nextInt();

		if ((tipoUva == 'A' || tipoUva == 'B') && (tamUva == 1 || tamUva == 2)) {
			if (tipoUva == 'A') {
				if (tamUva == 1) {
					precioFinal = precioInicial + 0.20;
				} else {
					precioFinal = precioInicial + 0.30;
				}
			} else {
				if (tamUva == 1) {
					precioFinal = precioInicial - 0.30;
				} else {
					precioFinal = precioInicial - 0.50;
				}
			}
			System.out.println("El precio final por kilo de uva es: " + precioFinal + " euros");
		} else {
			System.out.println("Tipo de uva o tamaño incorrecto");
		}
	}
}
