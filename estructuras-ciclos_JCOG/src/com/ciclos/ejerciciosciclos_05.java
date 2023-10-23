package com.ciclos;

import java.util.Scanner;

public class ejerciciosciclos_05 {
	public static void main(String[] args) {
	//5. Simular el comportamiento de un reloj digital,imprimiendo la hora,
	//	minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas	

		Scanner sc = new Scanner(System.in);

int horas;
int minutos;
int segundos;

for (int i = 0; i < 24; i++) { 
	horas=i;
	for (int j = 0; j < 60; j++) {
		minutos =j;
		for (int k = 0; k < 60; k++) {
			segundos = k;
	
			System.out.printf(horas+":" + minutos +":" + segundos);
		
		}
	}
  }
 }
}
