//Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente.

package com;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner entero = new Scanner(System.in);
		int mes;
		int numerodedias = 0;
		System.out.println("de que mes quieres saber cantos dias tiene?");
		mes = entero.nextInt();
		switch (mes) {
		case 1:
			numerodedias = 31;
			break;
		case 2:
			numerodedias = 28;
			break;
		case 3:
			numerodedias = 31;
			break;
		case 4:
			numerodedias = 30;
			break;
		case 5:
			numerodedias = 31;
			break;
		case 6:
			numerodedias = 30;
			break;
		case 7:
			numerodedias = 31;
			break;
		case 8:
			numerodedias = 31;
			break;
		case 9:
			numerodedias = 30;
			break;
		case 10:
			numerodedias = 31;
			break;
		case 11:
			numerodedias = 30;
			break;
		case 12:
			numerodedias = 31;
			break;
		}
		System.out.println("El mes tiene " + numerodedias);
	}
}
