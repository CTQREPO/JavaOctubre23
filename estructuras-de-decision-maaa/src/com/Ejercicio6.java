package com;

import java.util.Scanner;

public class Ejercicio6 {
/*
 * El director de una escuela está organizando un viaje de estudios y
 *  requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio.
 *   La forma de cobrar es la siguiente:

* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
* De 50 a 99 alumnos, el costo es de 70 euros.
* De 30 a 49 alumnos, el costo es de 95 euros.
* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.

Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno
 por el viaje.

 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Proporciona el numero de alumnos: ");
		
		int alumnos = entrada.nextInt();
		
		if(alumnos>=100) {
			System.out.println("Debe pagar $"+(alumnos*65));
			
		}else if(alumnos<100 && alumnos>=50){
			System.out.println("Debe pagar $"+(alumnos*70));
			
		}else if(alumnos<50 && alumnos>=30){
			System.out.println("Debe pagar $"+(alumnos*95));
			
		}else if (alumnos<30){
			System.out.println("Debe pagar $4000");
		}
		
	}
}
