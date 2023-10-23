
//Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el segundo número es 0, debe mostrar un mensaje de error.


package com;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		float n1,n2,division;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite 2 numeeros:");
		n1 = entrada.nextInt();
		n2= entrada.nextInt();
		
		if (n2 == 0) {
		System.out.println("Error");
		
	} else if (n2!=0) {
		division = n1/n2;
			System.out.println("El resultado es:"+ division);
		}
	}
}


	
