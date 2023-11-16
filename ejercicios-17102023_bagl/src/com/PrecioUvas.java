package com;

import java.util.Scanner;

public class PrecioUvas {

	public static void main(String[] args) {

		Scanner tecladoKilos = new Scanner (System.in);
		Scanner tecladoTipo = new Scanner(System.in);
		Scanner tecladoTamano = new Scanner (System.in);
		Scanner tecladoPrecio = new Scanner (System.in);
		
		
		System.out.println("Ingrese cantidad de Kilogramos: ");
		int kilos = tecladoKilos.nextInt();
		
		while(kilos <= 0) {
			System.out.println("Ingrese un valor valido de kilogramos");
			kilos = tecladoKilos.nextInt();
		}
		
		System.out.println("Ingrese precio por kilogramo: ");
		double precio = tecladoPrecio.nextDouble();
		
		while(precio <= 0) {
			System.out.println("Ingrese un precio valido");
			precio = tecladoPrecio.nextDouble();
		}
		
		
		
		
		System.out.println("Ingrese tipo: ");
		
		String tipo = tecladoTipo.next();
		
		while (!(tipo.contentEquals("A") || tipo.contentEquals("B"))) {
			System.out.println("Seleccione un tipo valido, 'A' o 'B':");
			tipo = tecladoTipo.next();
		}
		
		System.out.println("Ingrese Tamaño: ");
		
		int tamano = tecladoTamano.nextInt();
		
		while (!(tamano == 1 || tamano == 2)) {
			System.out.println("Seleccione un tamaño valido, 1 o 2:");
			tamano = tecladoTamano.nextInt();
		}
		
		if ( tipo.contentEquals("A") ) {
			if( tamano == 1 ) {
				precio = precio - 0.2;
			}
			if( tamano == 2 ) {
				precio = precio - 0.3;
			}
		}
		
		
		if ( tipo.contentEquals("B") ) {
			if( tamano == 1 ) {
				precio = precio - 0.3;
			}
			if( tamano == 2 ) {
				precio = precio - 0.5;
			}
		}
		double total = kilos * precio;
		
		System.out.println("Precio entregado al productor: $" + total );
		
		tecladoTipo.close();
		tecladoTamano.close();
		tecladoKilos.close();
		tecladoPrecio.close();
	}

}
