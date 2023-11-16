package com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		System.out.println("Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el segundo número es 0, debe mostrar un mensaje de error.");
		System.out.println("Ingrese Dividendo: ");
		Scanner teclado = new Scanner (System.in);
		
		double dividendo = teclado.nextDouble();
		
		System.out.println("Ingrese Divisor: ");
		
		double divisor = teclado.nextDouble();
		
		if( divisor == 0.0 ) {
			System.out.println("Error, no se puede dividir entre cero");
		}else {
			System.out.println(new DecimalFormat("0.000").format(dividendo/divisor ) );
		}
			
	}

}
