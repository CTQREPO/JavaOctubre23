package com;

import java.util.Scanner;

public class Ejercicio12 {
/*
 * Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un centro de salud,
 *  un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:

Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud,
 50% al comedor de ni�os y el resto se invierte en la bolsa.
Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 
60% al comedor de ni�os y el resto se invierte en la bolsa.

La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.

 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite la cantidad total de la donacion: ");
		double dona = entrada.nextDouble();
		
		if(dona>=10000) {
			System.out.println("El dinero se repartira de la siguiente manera: \n" + "Centro de Salud $"+(dona*.3)
					+"\nComedor de los ninhos $"+(dona*.5)+"\nInversion en bolsa $"+(dona*.2));
		}
		else {
			System.out.println("El dinero se repartira de la siguiente manera: \n" + "Centro de Salud $"+(dona*.25)
					+"\nComedor de los ninhos $"+(dona*.6)+"\nInversion en bolsa $"+(dona*.15));
		}
	}
}
