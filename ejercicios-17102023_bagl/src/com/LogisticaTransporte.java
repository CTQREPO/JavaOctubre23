package com;

import java.util.Scanner;

public class LogisticaTransporte {

	public static void main(String[] args) {

		System.out.println("Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América Central, \nAmérica del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y la zona a la que va dirigida. \nLo anterior se muestra en la siguiente tabla:");
		System.out.println("ZONA UBICACION           COSTO/KILOGRAMO\n"
						+ "1 América del Norte            24,00\n"
						+ "2 América Central              20,00\n"
						+ "3 América del Sur              21,00\n"
						+ "4 Europa                       10,00\n"
						+ "5 Asia                         18,00");
		
		System.out.println("Inserte número de Ubicación");
		Scanner leerUbi = new Scanner (System.in);
		
		int ubi = leerUbi.nextInt();
		
		while ( ubi < 1 || ubi > 5 ) {
			System.out.println("Número invalido, intente de nuevo:");
			System.out.println("Inserte número de Ubicación");
			ubi = leerUbi.nextInt();
		}
		
		
		System.out.println("Inserte cantidad de Kilogramos");
		Scanner leerKilos = new Scanner (System.in);
		
		double kilos = leerKilos.nextDouble();
		
		while ( kilos < 1 || kilos > 5 ) {
			System.out.println("Inserte un valor valido, no se transportan más de 5 KG, intente de nuevo:");
			System.out.println("Inserte cantidad de Kilogramos");
			kilos = leerKilos.nextDouble();
		}
		
		double total = 0;
		switch ( ubi ) {
		case 1:
			total = kilos * 24;
			break;
		case 2:
			total = kilos * 20;
			break;
		case 3:
			total = kilos * 21;
			break;
		case 4:
			total = kilos * 10;
			break;
		case 5:
			total = kilos * 18;
			break;
		}
		System.out.println("Costo final de: $" + total );
		
		
	}

}
