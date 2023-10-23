package com;

import java.util.Scanner;

public class Ejercicio10 {

	private static String[] zonaUbicacions;
	private static double[] costoKilogramos;
	private static Scanner reader;

	public static void main(String[] args) {

		zonaUbicacions = new String[] { "América del Norte", "América Central", "América del Sur", "Europa", "Asia" };
		costoKilogramos = new double[] { 24.0, 20.0, 21.0, 10.0, 18.0 };
		reader = new Scanner(System.in);

		System.out.println("--  Seleccione un numero del  1 al " + zonaUbicacions.length + "  --");
		for (int i = 0; i < zonaUbicacions.length; i++) {
			System.out.println("  " +(i + 1) + ") - " + zonaUbicacions[i] + " precio KG: $" + costoKilogramos[i]);
		}
		System.out.print("Ingrese un valor del (1-5): ");
		int num = reader.nextInt() - 1;
		
		System.out.print("Usted selecciono " +  zonaUbicacions[num] + " cuantos KG va a trasportar: ");
		int kilogramos = reader.nextInt();
		
		if (kilogramos >= 1 && kilogramos <= 5) {
			System.out.print("El precio a pagar de " + kilogramos+"KG es $" + (costoKilogramos[num] * kilogramos));
		} else if (kilogramos > 5) {
			System.out.println("Parte de nuestra política implica que los paquetes con \nun peso superior a 5kg no son transportados, por cuestiones \nde logística y seguridad.");
		}

	}
}
