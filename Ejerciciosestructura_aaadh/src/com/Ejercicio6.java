//El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:

//* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//* De 50 a 99 alumnos, el costo es de 70 euros.
//* De 30 a 49 alumnos, el costo es de 95 euros.
//* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
//Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.

package com;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float alumnos;

		System.out.println("Ingresa el numero de alumnos");
		alumnos = entrada.nextFloat();
		if (alumnos >= 100) {
			System.out.println("El costo total es:" + (alumnos * 65));
		}
		if (alumnos >= 50 && alumnos <= 99) {
			System.out.println("El costo total es:" + (alumnos * 70));
		}
		if (alumnos >= 30 && alumnos <= 49) {
			System.out.println("El costo total es:" + (alumnos * 95));
		}
		if (alumnos < 30) {
			System.out.println("El costo total por alumno:" + (4000 / alumnos));
		}
	}
}
