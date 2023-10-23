package com;

import java.util.Scanner;

public class Ejercicio12 {
/*
 * Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un centro de salud,
 *  un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:

Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud,
 50% al comedor de niños y el resto se invierte en la bolsa.
Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 
60% al comedor de niños y el resto se invierte en la bolsa.

La institución desea saber cuánto de dinero destinará a cada rubro anualmente.

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
