package com;

import java.util.Scanner;

public class DiasEnUnMes {

	public static void main(String[] args) {

		Scanner leerMes = new Scanner(System.in);

		System.out.println("Ingrese el número del día de la semana: (1 = enero)");
		int mes = leerMes.nextInt();
		String mesTxt = "";

		while (mes < 1 || mes > 12) {
			System.out.println("ERROR, número incorrecto, intente de nuevo");
			System.out.println("Ingrese el número del día de la semana: (1 = enero)");
			mes = leerMes.nextInt();
		}

		int dias = 0;

		switch (mes) {
		case 1:
			mesTxt = "Enero";
			dias = 31;
			break;
		case 2:
			mesTxt = "Febrero";
			dias = 28;
			break;
		case 3:
			mesTxt = "Marzo";
			dias = 31;
			break;
		case 4:
			mesTxt = "Abril";
			dias = 30;
			break;
		case 5:
			mesTxt = "Mayo";
			dias = 31;
			break;
		case 6:
			mesTxt = "Junio";
			dias = 30;
			break;
		case 7:
			mesTxt = "Julio";
			dias = 31;
			break;
		case 8:
			mesTxt = "Agosto";
			dias = 31;
			break;
		case 9:
			mesTxt = "Septiembre";
			dias = 30;
			break;
		case 10:
			mesTxt = "Octubre";
			dias = 31;
			break;
		case 11:
			mesTxt = "Noviembre";
			dias = 30;
			break;
		case 12:
			mesTxt = "Diciembre";
			dias = 31;
			break;
		}
		System.out.println("El mes seleccionado es: " + mesTxt + " y tiene " + dias + " dias.");
		leerMes.close();

	}

}
