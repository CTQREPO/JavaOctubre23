package com;

import java.util.Scanner;

public class Eje12 {

	public static void main(String[] args) {

		double donacion;
		double salud;
		double comedor;
		double bolsa;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ESCRIBE LA CANTIDAD DONADA $ PARA SABER CUANTO ASIGNAR A SALUD COMEDOR DE NIÑO E INVERSION");
		donacion=entrada.nextDouble();
		
		if(donacion>=10000) {
			salud=donacion*0.30;
			comedor=donacion*0.50;
			bolsa=donacion-(salud+comedor);
			System.out.println("CENTRO DE SALUD $"+salud);
			System.out.println("COMEDOR PARA NIÑOS $"+comedor);
			System.out.println("INVERCION EN BOLSA $"+bolsa);
		}else {
			salud=donacion*0.25;
			comedor=donacion*0.60;
			bolsa=donacion-(salud+comedor);
			System.out.println("CENTRO DE SALUD $"+salud);
			System.out.println("COMEDOR PARA NIÑOS $"+comedor);
			System.out.println("INVERCION EN BOLSA $"+bolsa);
		}
	}

}
//><