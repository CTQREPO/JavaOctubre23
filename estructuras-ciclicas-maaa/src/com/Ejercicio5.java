package com;

public class Ejercicio5 {

	public static void main(String[] args) {
		
	//5. Simular el comportamiento de un reloj digital,
	//imprimiendo la hora, minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		
		
		for (int i = 0; i < 24; i++) {
			
			for (int j = 0; j < 60; j++) {
				
				for (int j2 = 0; j2 < 60 ; j2++) {
				System.out.println(i+":"+j+":"+j2);	
				}
			}
			
		}
		
	}
}
