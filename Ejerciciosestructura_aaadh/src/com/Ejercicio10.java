//	Una compa��a de transporte internacional tiene servicio en algunos pa�ses de Am�rica del Norte, Am�rica Central, Am�rica del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
//ZONA UBICACI�N	     COSTO/KILOGRAMO
//1 Am�rica del Norte	  24,00 euros
//2	Am�rica Central	      20, 00 euros
//3 Am�rica del Sur	      21,00 euros
//3	Europa	              10,00 euros
//5 Asia	              18,00 euros
//Parte de su pol�tica implica que los paquetes con un peso superior a 5kg no son transportados, por cuestiones de log�stica y seguridad.

package com;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner entero = new Scanner(System.in);
		int z, p;

		System.out.println("Ingresa los datos correspondientes");
		System.out.println("Digite la zona:");
		z = entero.nextInt();
		System.out.println("Digite el peso de su paquete:");
		p = entero.nextInt();

		if (p > 5) {
			System.out.println("El paquete no puede ser transportar.");
		} else {
			switch (z) {

			case 1:
				System.out.println("El costo por servicio de transporte es:" + (p * 24) + "euros");
				break;
			case 2:
				System.out.println("El costo por servicio de transporte es:" + (p * 20) + "euros");
				break;
			case 3:
				System.out.println("El costo por servicio de transporte es:" + (p * 21) + "euros");
				break;
			case 4:
				System.out.println("El costo por servicio de transporte es:" + (p * 10) + "euros");
				break;
			case 5:
				System.out.println("El costo por servicio de transporte es:" +(p * 18) + "euros");
				break;

			}
		}
	}
}
