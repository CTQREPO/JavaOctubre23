package com;

import java.util.Scanner;

public class Ejercicio12 {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
        int sumaEdades = 0;
        int cantidadEdades = 0;

        while (true) {
            System.out.print("Ingrese una edad (o ingrese un número negativo para detenerse): ");
            int edad = reader.nextInt();

            if (edad < 0) {
                break;
            }

            sumaEdades += edad;
            cantidadEdades++;
        }

        if (cantidadEdades > 0) {
            double promedio = (double) sumaEdades / cantidadEdades;
            System.out.println("El promedio de edades es: " + promedio);
            if (promedio > 25) {
                System.out.println("El promedio es superior a 25. El programa se detiene.");
            }
        } else {
            System.out.println("No se ingresaron edades.");
        }
	}
}
