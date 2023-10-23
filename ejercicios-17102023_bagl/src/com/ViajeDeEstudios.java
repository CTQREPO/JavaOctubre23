package com;

import java.util.Scanner;

public class ViajeDeEstudios {

	public static void main(String[] args) {

		Scanner leerAlumnos = new Scanner (System.in);
		System.out.println("El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:\r\n" + 
				"\r\n" + 
				"* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.\r\n" + 
				"* De 50 a 99 alumnos, el costo es de 70 euros.\r\n" + 
				"* De 30 a 49 alumnos, el costo es de 95 euros.\r\n" + 
				"* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.\r\n" + 
				"");
		System.out.println("Ingrese la cantidad de alumnos que asistirán:");
		int alumnos = leerAlumnos.nextInt();
		
		while (alumnos <= 0) {
			System.out.println("Error, ingrese valor válido");
			alumnos = leerAlumnos.nextInt();
		}
		
		double costo = 0;
		double costoCamion = 4000;
		
		if ( alumnos >= 100 ) {
			costo = 65;
			costoCamion = costo * alumnos;
		}else if ( alumnos >= 50 && alumnos <= 99) {
			costo = 70;
			costoCamion = costo * alumnos;
		}else if ( alumnos >= 30 && alumnos <= 49) {
			costo = 95;
			costoCamion = costo * alumnos;
		}else if ( alumnos >= 0 && alumnos <= 29) {
			costo = costoCamion / alumnos ;
		}
		System.out.println("El costo del camión es de: " + costoCamion);
		System.out.println("El costo por aluno es de: " + costo);
		
		leerAlumnos.close();
	}

}
