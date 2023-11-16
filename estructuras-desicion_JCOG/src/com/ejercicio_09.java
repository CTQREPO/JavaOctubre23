package com;

import java.util.Scanner;

public class ejercicio_09 {
	public static void main(String[] args) {
	//9.	Realiza un programa que pida un número entero entre uno y
	//		doce e imprima el número de días que tiene el mes correspondiente.
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("ingrese un numero correspondinete a los meses del año entre 1 y 12");
	int dia = sc.nextInt();
	switch (dia) {
	case 1:
		System.out.println("el mes de ENERO tiene 31 días");
		break;
	case 2:
		System.out.println("el mes de FEBRERO tiene 28 días");
		break;
	case 3:
		System.out.println("el mes de MARZO tiene 31 días");
		break;	
	case 4:
		System.out.println("el mes de ABRIL tiene 30 días");
		break;
	case 5:
		System.out.println("el mes de MAYO tiene 31 días");
		break;
	case 6:
		System.out.println("el mes de JUNIO tiene 30 días");
		break;
	case 7:
		System.out.println("el mes de JULIO tiene 31 días");
		break;
	case 8:
		System.out.println("el mes de AGOSTO tiene 31 días");
		break;
	case 9:
		System.out.println("el mes de SEPTIEMBRE tiene 30 días");
		break;
	case 10:
		System.out.println("el mes de OCTUBRE tiene 31 días");
		break;
	case 11:
		System.out.println("el mes de NOVIEMBRE tiene 30 días");
		break;
	case 12:
		System.out.println("el mes de DICIEMBRE tiene 31 días");
		break;	
		
	default:
		System.out.println("ERROR, EL NUMERO INGRESADO ES INCORRECTO");
		break;
}
}
}