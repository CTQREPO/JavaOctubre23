package com;

import java.util.Scanner;

public class Eje5 {

	public static void main(String[] args) {

		int segundos=0;
		int minutos=0;
		int horas=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("SIMULADOR DE RELOJ");
		
		for (int i = 0; i < 24; i++) {//horas

			for (int j = 0; j < 60; j++) {//minutos
				
				for (int k = 0; k < 60 ; k++) {//segundos
					
					 System.out.printf("%02d:%02d:%02d\n", i, j, k);
					
			
				        try {
				            // Pausa la ejecución durante 1 segundo (1000 milisegundos)
				            Thread.sleep(1000);
				        } catch (InterruptedException e) {
				            e.printStackTrace();
				        }
				}

				
			}
		}
	}

}
