package com;

import java.util.Scanner;

public class Eje8 {
	public static void main(String[] args) {
		int dia;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ESCRIBE EL NUMERO DEL DIA (1-7)PARA SABER QUE DIA ES");
		dia=entrada.nextInt();
		switch(dia) {
		case 1:
			System.out.println("LUNES");
			break;
		
		case 2:
			System.out.println("MARTES");
			break;
		case 3:
			System.out.println("MIERCOLES");
			break;
		case 4:
			System.out.println("JUEVES");
			break;
		case 5:
			System.out.println("VIERNES");
			break;
		case 6:
			System.out.println("SABADO");
			break;
		case 7:
			System.out.println("DOMINGO");
			break;
		default: System.out.println("NUMERO INCORRECTO");
		}
	}

}
