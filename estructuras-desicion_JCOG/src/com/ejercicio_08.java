package com;

import java.util.Scanner;

public class ejercicio_08 {
public static void main(String[] args) {
	//8.	Realiza un programa que pida el día de la semana (del 1 al 7)
	//  y escriba el día correspondiente. Si introducimos otro número nos da un error.
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("ingrese un numero correspondinete a los dias de la semana entre 1 y 7");
	int dia = sc.nextInt();
	switch (dia) {
	case 1:
		System.out.println("el dia es LUNES");
		break;
	case 2:
		System.out.println("el dia es MARTES");
		break;
	case 3:
		System.out.println("el dia es MIERCOLES");
		break;	
	case 4:
		System.out.println("el dia es JUEVES");
		break;
	case 5:
		System.out.println("el dia es VIERNES");
		break;
	case 6:
		System.out.println("el dia es SABADO");
		break;
	case 7:
		System.out.println("el dia es DOMINGO");
		break;
		
	default:
		System.out.println("ERROR EL NUMERO INGRESADO ES INCORRECTO");
		break;
}
}
}