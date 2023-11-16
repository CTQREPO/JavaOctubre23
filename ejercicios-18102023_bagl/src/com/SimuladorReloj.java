package com;

import java.util.Scanner;

public class SimuladorReloj {

	public static void main(String[] args) {

		System.out.println("Simulador de reloj analógico");
		
		System.out.println("Pulse 1 para iniciar");
		
		Scanner teclado = new Scanner (System.in);
		int inicio = teclado.nextInt();
		
		if (inicio == 1) {
			for (int i = 0; i < 24; i++) {
				for (int j = 0; j < 60; j++) {
					for (int k = 0;  k < 60; k ++) {
						if (i < 10) {
							System.out.print( "0" + i + ":" );
						}else {
							System.out.print(i + ":" );
						}
						if (j < 10) {
							
							System.out.print( "0" + j + ":" );
						}else {
							System.out.print(j + ":" );
						}
						if (k < 10) {
							System.out.println( "0" + k );
						}else {
							System.out.println(k);
						}
						
					}
				}
			}
		}
		teclado.close();
	}

}
