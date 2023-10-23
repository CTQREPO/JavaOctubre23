package com;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner entero = new Scanner(System.in);
		int horasTrabajo;
		int valorHora=16;
		int horaExtra=20;
		
		System.out.println("Digite sus horas trabajadas");
		horasTrabajo = entero.nextInt();
		
		if (horasTrabajo <=40){
		      System.out.println("Tu salario semanal es:"+ horasTrabajo*valorHora);
		} else {
			System.out.println("Tu salario semanal es:"+ ((40*valorHora)+(horasTrabajo%40)*horaExtra)) ;
		}
	}

}

