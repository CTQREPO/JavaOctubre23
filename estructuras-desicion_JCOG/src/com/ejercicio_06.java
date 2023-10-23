package com;

import java.util.Scanner;

public class ejercicio_06 {
	public static void main(String[] args) {
		/*6.	El director de una escuela está organizando un viaje de estudios y requiere determinar
		        cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio.
		        La forma de cobrar es la siguiente:
		 

		 * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
		 * De 50 a 99 alumnos, el costo es de 70 euros.
		 * De 30 a 49 alumnos, el costo es de 95 euros.
		 * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
		Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.*/
		
		Scanner sc = new Scanner (System.in);
		
		int alumnos;
		double autobusprecio;
		
		System.out.println("INGRESE LA CANTIDAD DE ALUMNOS: ");
		alumnos = sc.nextInt();
		
		if (alumnos >= 100) {
			System.out.println("el costo por alumno es: 65 euros");
		}else if (alumnos >=50 && alumnos <=99) {
			System.out.println("el costo por alumno es: 70 euros");
		}else if (alumnos>=30 && alumnos <=49) {
			System.out.println("el costo por alumno es: 95 euros");
		}else if (alumnos<=29) {
			autobusprecio = (4000/30);
			System.out.println("el costo por alumno es de: "+autobusprecio);
			
		}
		
		
	}
}
