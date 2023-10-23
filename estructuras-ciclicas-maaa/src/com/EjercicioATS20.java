package com;

import java.util.Scanner;

public class EjercicioATS20 {

	//Introduce un numero N y solicita N sueldos, luego indica cual es el sueldo mayor
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		float sueldo, sueldo2;
		
		System.out.println("Digite un numero de sueldos: ");
		numero = entrada.nextInt();//5
		
		System.out.println("Digite un sueldo ");
		sueldo = entrada.nextFloat();//1000
		
		for (int i = 1; i < numero; i++) {
			
			System.out.println("Digite otro sueldo: ");
			sueldo2=entrada.nextFloat();//2000
			if(sueldo<sueldo2) {
				sueldo=sueldo2;//sueldo=2000
			}
		}
		System.out.println("El sueldo mayor es: $"+sueldo);
	}
}
