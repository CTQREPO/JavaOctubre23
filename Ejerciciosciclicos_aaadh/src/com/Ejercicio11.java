//Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el ancho y el alto.
//Ejemplo: 8 x 8

package com;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		System.out.println("Coloca la altura:");
		Scanner entrada = new Scanner(System.in);
		int altura = entrada.nextInt();
		while (altura <= 0) {

			altura = entrada.nextInt();
		}
		System.out.println("Coloca ancho:");
		int ancho = entrada.nextInt();
		while (ancho <= 0) {
			ancho = entrada.nextInt();
		}
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("* ");
			}
			System.out.println("");

		}
	}
}