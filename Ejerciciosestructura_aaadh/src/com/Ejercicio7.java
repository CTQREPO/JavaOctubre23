//Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
//Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
//Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto”.

package com;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner entero = new Scanner(System.in);

		int caras;
		String reves = "";

		System.out.println("tire el dado");
		caras = entero.nextInt();

		 if (caras >6){
		      System.out.println("Error");
		    } else {
			
			switch (caras) {
			case 1:
				reves = "seis";
				break;
			case 2:
				reves = "cinco";
				break;
			case 3:
				reves = "cuatro";
				break;
			case 4:
				reves = "tres";
				break;
			case 5:
				reves = "dos";
				break;
			case 6:
				reves = "uno";
			}
			System.out.println("la cara trasera es " + reves);

		
		
		}
	}
}
