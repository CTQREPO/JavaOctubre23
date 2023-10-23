package com;

import java.util.Scanner;

public class AceptacionBase {

	public static void main(String[] args) {

		System.out.println(
				"Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo. Salir edad = -14");
		Scanner tecladoSexo = new Scanner(System.in);
		Scanner tecladoEdad = new Scanner(System.in);
		Scanner tecladoNota = new Scanner(System.in);

		int edad = 0;

		while (edad != -14) {

			System.out.println("Ingrese la letra según corresponda su sexo, Masculino 'M', femenino 'F': ");

			String sexo = tecladoSexo.nextLine();

			while (!(sexo.contentEquals("M") || sexo.contentEquals("F"))) {

				System.out.println("Valor incorrecto, intente de nuevo: ");
				sexo = tecladoSexo.nextLine();
			}

			System.out.println("Ingrese su edad: ");
			edad = tecladoEdad.nextInt();
			System.out.println("Ingrese su nota: ");
			double nota = tecladoNota.nextDouble();

			while (!(nota >= 0 && nota <= 10)) {

				System.out.println("Valor incorrecto, rango de 0 a 10 intente de nuevo: ");
				nota = tecladoNota.nextDouble();
			}

			String aceptacion = "NO ACEPTADA";

			if (nota >= 5 && nota <= 10) {
				if (edad >= 18 && edad < 80) {
					if (sexo.contentEquals("M")) {
						aceptacion = "POSIBLE";
					}
					if (sexo.contentEquals("F")) {
						aceptacion = "ACEPTADA";
					}
				}
			}
			System.out.println("Estatus: " + aceptacion);
		}
		tecladoSexo.close();
		tecladoEdad.close();
		tecladoNota.close();
	}

}
