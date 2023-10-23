package com;

import java.util.Scanner;

public class ejercicio_10 {
public static void main(String[] args) {
	/*10.	Una compañía de transporte internacional tiene servicio en
	algunos países de América del Norte, América Central, América del Sur,
	Europa y Asia. El costo por servicio de transporte se basa en el peso del
	paquete y la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
	
	ZONA UBICACIÓN		COSTO/KILOGRAMO
1 América del Norte		24,00 euros
2 América Central		20, 00 euros
3 América del Sur		21,00 euros
4 Europa				10,00 euros
5 Asia					18,00 euros

Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por cuestiones de logística y seguridad.
Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega. */
	
	Scanner sc = new Scanner (System.in);
	
	double pesopaquete;
	String zona;
	
	System.out.println("INGRESE EL PESO DEL PAQUETE EN kg: ");
	pesopaquete = sc.nextDouble();
	
	if (pesopaquete > 5) {
		System.out.println("EL PAQUETE HA SIDO RECHAZADO");
	}else {
		System.out.println("SELECCIONE EL DESTINO: ");
		System.out.println("1) AMERICA DEL NORTE");
		System.out.println("2) AMERICA CENTRAL");
		System.out.println("3) AMERICA DEL SUR");
		System.out.println("4) EUROPA");
		System.out.println("5) ASIA");
		
		int option = sc.nextInt();
		
		switch (option) {
		case 1:
			double americadelnorte = (pesopaquete*24.00);
			System.out.println("EL PRECIO DEL ENVIO ES: "+ americadelnorte);
			break;
		case 2:
			double americacentral = (pesopaquete*20.00);
			System.out.println("EL PRECIO DEL ENVIO ES: "+ americacentral);
			break;
		case 3:
			double americadelsur = (pesopaquete*21.00);
			System.out.println("EL PRECIO DEL ENVIO ES: "+ americadelsur);
			break;
		case 4:
			double europa = (pesopaquete*10.00);
			System.out.println("EL PRECIO DEL ENVIO ES: "+ europa);
			break;
		case 5:
			double asia = (pesopaquete*18.00);
			System.out.println("EL PRECIO DEL ENVIO ES: "+ asia);
			break;
		}
	  }	
	}
 }

