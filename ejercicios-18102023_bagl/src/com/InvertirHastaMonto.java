package com;

import java.util.Scanner;

public class InvertirHastaMonto {

	public static void main(String[] args) {

		System.out.println("Ingrese el valor a invertir a un 2% mensual: ");
		Scanner teclado = new Scanner (System.in);
		
		double monto = teclado.nextDouble();
		
		System.out.println("Ingrese la cantidad que desea recibir de su inversión y se le dirá el tiempo a esperar ");
		double montoFinal = teclado.nextDouble();
		
		while (montoFinal < monto) {
			System.out.println("Debe ser un valor mayor al monto inicial");
			System.out.println("Ingrese la cantidad que desea recibir de su inversión y se le dirá el tiempo a esperar ");
			montoFinal = teclado.nextDouble();
		}
		
		int mes = 0;
		for (int i = 0; monto <= montoFinal ; i ++) {
			monto = monto * 1.02;
			mes ++;
		}
		
		System.out.println("Al término del mes " + mes +" tendrás la cantidad de " + monto );
		teclado.close();
	}

}
