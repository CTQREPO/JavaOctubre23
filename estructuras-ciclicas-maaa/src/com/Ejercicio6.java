package com;

import java.util.Scanner;

public class Ejercicio6 {
//6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. 
//Cual será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double suma = 1000;
		for (int mes = 1; mes <= 12; mes++) {
			suma*=1.02;
			System.out.println("Total del mes " + mes + ": $" + suma);
		}
		
	}
}
