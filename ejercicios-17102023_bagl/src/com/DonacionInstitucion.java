package com;

import java.util.Scanner;

public class DonacionInstitucion {

	public static void main(String[] args) {

		
		System.out.println("Donación a institución benéfica");
		System.out.println("Inserte el monto donado");
		Scanner leerDonacion = new Scanner (System.in);
		
		double donacion = leerDonacion.nextDouble();
		
		while ( donacion <= 0 ) {
			System.out.println("Monto invalido, intente de nuevo:");
			System.out.println("Inserte el monto donado");
			donacion = leerDonacion.nextDouble();
		}
		
		double centro = 0;
		double comedor = 0;
		double bolsa = 0;
		
		if ( donacion < 10000 ) {
			centro = donacion * 0.25;
			comedor = donacion * 0.6;
			bolsa = donacion * 0.15;
		}else {
			centro = donacion * 0.3;
			comedor = donacion * 0.5;
			bolsa = donacion * 0.2;		
		}
		
		System.out.println("Donar al centro de salud $" + centro + ", donar al comedor $" + comedor + ", invertir en bolsa $" + bolsa);
	}

}
