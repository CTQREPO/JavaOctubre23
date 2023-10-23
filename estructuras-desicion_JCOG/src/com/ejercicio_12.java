package com;

import java.util.Scanner;

public class ejercicio_12 {
public static void main(String[] args) {
	
	/*12.	Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un centro de salud,
	 	un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:

Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños y el resto se invierte en la bolsa.

Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de niños y el resto se invierte en la bolsa.

La institución desea saber cuánto de dinero destinará a cada rubro anualmente.*/
	
	Scanner sc = new Scanner(System.in);
	
	int donaciones;
	double centrosalud;
	double comedor;
	double inversion;
	
	System.out.println("ingrese el monto a donar: ");
	donaciones=sc.nextInt();
	
	if(donaciones>=10000) {
		centrosalud = donaciones*0.3;
		comedor = donaciones*0.5;
		inversion = donaciones-centrosalud-comedor;
		
		System.out.println("el centro de salud recive: "+centrosalud);
		System.out.println("el comedor recibe: "+comedor);
		System.out.println("se esta destinando: "+inversion);
	}else {
		centrosalud = donaciones*0.25;
		comedor = donaciones*0.6;
		inversion = donaciones-centrosalud-comedor;
		
		System.out.println("el centro de salud recive: "+centrosalud);
		System.out.println("el comedor recibe: "+comedor);
		System.out.println("se esta destinando: "+inversion);
	}
	

}
}
