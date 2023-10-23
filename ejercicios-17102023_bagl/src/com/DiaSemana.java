package com;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		
		Scanner leerDia = new Scanner (System.in);
		
		System.out.println("Ingrese el número del día de la semana: (1 = domingo)");
		int dia = leerDia.nextInt();
		
		while (dia < 1 || dia > 7) {
			System.out.println("ERROR, número incorrecto, intente de nuevo");
			System.out.println("Ingrese el número del día de la semana: ");
			dia = leerDia.nextInt();
		}
		
		switch ( dia ) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Martes");
			break;
		case 4:
			System.out.println("Miércoles");
			break;
		case 5:
			System.out.println("Jueves");
			break;
		case 6:
			System.out.println("Viernes");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		}
		
		leerDia.close();
		
	}
	
}
