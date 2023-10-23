package com;

import java.util.Scanner;

public class Ejercicio13 {

	private static Scanner reader;

	public static void main(String[] args) {
	
		reader = new Scanner(System.in);
		
		System.out.println("   --  Calculo de horas trabajadas  --   ");
		System.out.print("   Paso 1: Ingrese la cantidad de horas trabajadas: ");
		int horasTrabajadas = reader.nextInt();
		double salarioSemanal;
		
		if (horasTrabajadas <= 40) {
			salarioSemanal = (horasTrabajadas * 16.0);
		} else {
			int horasNormales = 40;
			int horasExtras = horasTrabajadas - horasNormales;
			salarioSemanal = (horasNormales * 16.0) + (horasExtras * 20.0);
		}
		
        System.out.println("El salario semanal del obrero es: $" + salarioSemanal);
	}
}
