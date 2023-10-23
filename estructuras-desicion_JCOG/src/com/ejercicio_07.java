package com;

import java.util.Scanner;

public class ejercicio_07 {
	public static void main(String[] args) {
		/*7.	Realiza un programa que pida por teclado el resultado (dato entero)
				obtenido al lanzar un dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
				Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
				Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto”.*/
		Scanner sc = new Scanner (System.in);
		
		int resultado;
		
		System.out.println("INGRESE EL NUMERO DEL DADO DEL 1 al 6");
		resultado = sc.nextInt();
		
		if (resultado <= 0 || resultado >= 7) {
			System.out.println("ERROR NUMERO INCORRECTO");
		}else if ( resultado == 1) {
			System.out.println("el resultado es seis");			
		}else if (resultado == 2) {
			System.out.println("el resultado es cinco");
		}else if (resultado == 3) {
			System.out.println("el resultado es cuatro");
		}else if (resultado == 4) {
			System.out.println("el resultado es tres");
		}else if (resultado == 5) {
			System.out.println("el resultado es dos");
		}else if (resultado == 6) {
			System.out.println("el resultado es uno");
	}
  }
}
