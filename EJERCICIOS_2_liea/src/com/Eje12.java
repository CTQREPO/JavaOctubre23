package com;

import java.util.Scanner;

public class Eje12 {

	public static void main(String[] args) {

		double sum=0;
		int edad;
		int i=0;
		double prom=0;
		int cant=0;
		Scanner entrada = new Scanner(System.in); // ESCANEA EL DATO PROPORCIONADO POR EL USUARIO
		
		System.out.println("INGRESA EDADES");
		
		while(prom<=25) {
			//System.out.println("INGRESA EDADES");
			edad=entrada.nextInt();
			i++;
			
			sum=sum+edad;
				prom=sum/i;
				
				
		}
		System.out.println("PROMEDIO: "+prom);
		System.out.println("NUMERO DE EDADES REGISTRADAS: " +i);
	}

}
