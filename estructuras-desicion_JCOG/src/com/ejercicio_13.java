package com;

import java.util.Scanner;

public class ejercicio_13 {
public static void main(String[] args) {
	/*13.	Un obrero necesita calcular su salario semanal,
	  el cual se obtiene de la siguiente manera: Si trabaja 40 horas o menos se le paga $16 por hora.
	  Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.*/
	
	Scanner sc = new Scanner (System.in);
int horastrabajadas;
int salario;
int horasextra;
int salarioextraporhora;

System.out.println("INGRESE HORAS TRABAJADAS A LA SEMANA: ");
horastrabajadas = sc.nextInt();

if (horastrabajadas<=40) {
	salario = horastrabajadas*16;
	System.out.println("el salario es: "+salario);
} else {
	horasextra = horastrabajadas - 40;
	salarioextraporhora = horasextra*20;
	salario = salarioextraporhora +(40*16);
	System.out.println("el salario semanal es: "+salario);
		
	
	
		}
	}

}