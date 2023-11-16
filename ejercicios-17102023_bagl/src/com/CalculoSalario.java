package com;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {

		System.out.println("Calculadora de salario, $16 por 40 horas de trabajo o menos, $20 por horas extra si sobrepasan las 40 horas");
		System.out.println("Inserte las horas trabajadas");
		Scanner leerHoras = new Scanner (System.in);
		
		double horas = leerHoras.nextDouble();
		
		while ( horas <= 0 ) {
			System.out.println("Monto invalido, intente de nuevo:");
			System.out.println("Inserte el monto donado");
			horas = leerHoras.nextDouble();
		}
		
		double salario = 0;
		
		if (horas <= 40) {
			salario = horas * 16;
		}
		if (horas > 40) {
			salario = 40 * 16 + ((horas - 40) * 20);
		}
		
		
		System.out.println("El salario por " + horas + " horas de trabajo es de: $" + salario);
	}

}
