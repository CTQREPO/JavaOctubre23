package com;

import java.util.Scanner;

public class Ejercicio13 {
/*
 * Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
 *  Si trabaja 40 horas o menos se le paga $16 por hora.
 *  Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite las horas trabajadas: ");
		
		int horas = sc.nextInt();
		
		if(horas<=40) {
			System.out.println("Pago de la semana: $" + (horas*16));
		}
		else {
			System.out.println("Pago de la semana: $" + ((40*16)+(20*(horas-40))));
		}
		
	}
}
