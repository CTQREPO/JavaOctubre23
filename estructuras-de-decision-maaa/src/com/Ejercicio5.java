package com;

import java.util.Scanner;

public class Ejercicio5 {
/*
 La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, 
 la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto,
 �sta es de un s�lo tipo y tama�o, se requiere determinar cuanto recibir� un productor por la uva que entrega
 en un embarque considerando lo siguiente:
 Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2.
 Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2.
 Precio inicial se recibe desde teclado
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char tipo;
		int tamanho, precio;
		
		System.out.println("Proporcione el tipo de uva: ");
		tipo = entrada.next().charAt(0);
		
		System.out.println("Proporcione el tamanho de la uva: ");
		tamanho = entrada.nextInt();
		
		System.out.println("Proporcione el precio inicial del kg de uva: ");
		precio = entrada.nextInt();
		
		switch(tipo) {
		case 'A':
			if(tamanho==1) {
				System.out.println("El precio final por kg de uva es "+(precio+.20));
			}
			else {
				System.out.println("El precio final por kg de uva es "+(precio+.30));
			}
			break;
			
		case 'B':
			if(tamanho==1) {
				System.out.println("El precio final por kg de uva es "+(precio-.30));
			}
			else {
				System.out.println("El precio final por kg de uva es "+(precio-.50));
			}
			break;
			
		default: System.out.println("El valor proporcionado no es valido");
				break;
		}
		
	}
}
