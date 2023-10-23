package com;

import java.util.Scanner;

public class DadoCaraOpuesta {

	public static void main(String[] args) {

		Scanner leerCara = new Scanner (System.in);
		
		System.out.println("Ingrese el número de la cara del dado: ");
		
		int cara = leerCara.nextInt();
		
		while (cara <1 || cara > 6) {
			System.out.println("ERROR, número incorrecto, intente de nuevo");
			System.out.println("Ingrese el número de la cara del dado: ");
			cara = leerCara.nextInt();
		}
		
		String caraTxt = "";
		
		switch(cara) {
		case 1:
			caraTxt = "Seis";
			break;
		case 2:
			caraTxt = "Cinco";
			break;
		case 3:
			caraTxt = "Cuatro";
			break;
		case 4:
			caraTxt = "Tres";
			break;
		case 5:
			caraTxt = "Dos";
			break;
		case 6:
			caraTxt = "Uno";
			break;
		}
		
		System.out.println("El número de la cara opuesta a " + cara + " es: " + caraTxt);
		leerCara.close();
	}

}
