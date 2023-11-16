package com;

import java.util.Scanner;

public class Ejercicio11 {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		System.out.println("  -- Calcular IMC de una persona  --  ");
		System.out.print("    Ingrese su peso en [kg]: ");
		double peso = reader.nextDouble();
		System.out.print("    Ingrese su altura en [m]: ");
		double altura = reader.nextDouble();
		double imc = (peso / altura);

		System.out.println("    Su IMC es: " + String.format("%.2f", imc));
		if (imc < 16) {
			System.out.println("    Diagnóstico: criterio de ingreso en hospital");
		} else if (imc > 16 && imc <= 17) {
			System.out.println("    Diagnóstico: infrapeso");
		} else if (imc > 17 && imc <= 18) {
			System.out.println("    Diagnóstico: bajo de peso");
		} else if (imc > 18 && imc <= 25) {
			System.out.println("    Diagnóstico: peso normal (saludable)");
		} else if (imc > 25 && imc <= 30) {
			System.out.println("    Diagnóstico: sobrepeso (obesidad de grado I)");
		} else if (imc > 30 && imc <= 35) {
			System.out.println("    Diagnóstico: sobrepeso crónico (obesidad de grado II)");
		} else if (imc > 35 && imc <= 40) {
			System.out.println("    Diagnóstico: obesidad premórbida (obesidad de grado III)");
		} else {
			System.out.println("    Diagnóstico: obesidad mórbida (obesidad de grado IV)");
		}
	}

}
