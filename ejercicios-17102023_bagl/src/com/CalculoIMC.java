package com;

import java.util.Scanner;

public class CalculoIMC {
	public static void main(String[] args) {
		
		System.out.println("Programa para el cálculo del IMC");
		System.out.println("Inserte altura en metros");
		Scanner leerAltura = new Scanner (System.in);
		
		double altura = leerAltura.nextDouble();
		
		while ( altura <= 0 || altura > 3 ) {
			System.out.println("Número invalido, intente de nuevo:");
			System.out.println("Inserte número de Ubicación");
			altura = leerAltura.nextDouble();
		}
		
		
		System.out.println("Inserte peso en Kilogramos");
		Scanner leerPeso = new Scanner (System.in);
		
		double peso = leerPeso.nextDouble();
		
		while ( peso < 0 || peso > 200 ) {
			System.out.println("Inserte un valor valido, no se transportan más de 5 KG, intente de nuevo:");
			System.out.println("Inserte cantidad de Kilogramos");
			peso = leerPeso.nextDouble();
		}
		
		String diagnostico = "";
		
		double imc = peso / (altura * altura);
		
		if (imc < 16 ) {
			diagnostico = "Criterio de ingreso en hospital";
		}else if (imc < 17 && imc >= 16 ) {
			diagnostico = "Infrapeso";
		}else if (imc < 18 && imc >= 17 ) {
			diagnostico = "Bajo peso";
		}else if (imc < 25 && imc >= 18 ) {
			diagnostico = "Peso normal (Saludable)";
		}else if (imc < 30 && imc >= 25 ) {
			diagnostico = "Sobrepeso (Obesidad de grado 1)";
		}else if (imc < 35 && imc >= 30 ) {
			diagnostico = "Sobrepeso Crónico (Obesidad de grado 2)";
		}else if (imc < 40 && imc >= 35 ) {
			diagnostico = "Obesidad Premórbida (Obesidad de grado 3)";
		}else if (imc >= 40 ) {
			diagnostico = "Obesidad Mórbida (Obesidad de grado 4)";
		}
		
		System.out.println(diagnostico);
		
	}
}
