//Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//
//Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os y el resto se invierte en la bolsa.
//Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de ni�os y el resto se invierte en la bolsa.
//La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.

package com;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float donacion;
		System.out.println("Ingresa el monto de donacion");
		donacion = entrada.nextFloat();
		int centrosalud = 0;
		int comedor = 0;
		int bolsa = 0;

		if (donacion >= 1000) {
			System.out.println("El dinero destinado a centro de salud es:" + (donacion * 0.30));
			System.out.println("El dinero destinado a comedor de ni�os es:" + (donacion * 0.50));
			System.out.println("El dinero a invertir en la bolsa es:" + (donacion * 0.20));
		}
		if (donacion < 1000) {
			System.out.println("El dinero destinado a centro de salud es:" + (donacion * 0.25));
			System.out.println("El dinero destinado a comedor de ni�os es:" + (donacion * 0.60));
			System.out.println("El dinero a invertir en la bolsa es:" + (donacion * 0.15));
		}

	}
}
