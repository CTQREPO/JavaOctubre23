package com;

import java.util.Scanner;

public class EjercicioATS13 {
//Pedir 10 numeros y decir la media de positivos y negativos y la cantidad de ceros
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	double numero, contPos=0, contNeg=0, sumaNeg=0, sumaPos=0, contCero=0, mediaPos, mediaNeg;
	
	for (int i = 0; i <10; i++) {
		System.out.println("Introduce un numero entero: ");
		numero = entrada.nextDouble();
		
		if(numero > 0) {
			contPos++;
			sumaPos+=numero;
		}
		else if(numero<0) {
			contNeg++;
			sumaNeg+=numero;
		}
		else {
			contCero++;
		}
		
	}
	mediaPos=sumaPos/contPos;
	mediaNeg=sumaNeg/contNeg;
	
	System.out.println("El numero 0 aparece "+contCero+" veces");
	
	if(contPos>0) {
		System.out.println("La media de numeros positivos es: "+mediaPos);
	}
	else {
		System.out.println("No es posible obtener la media de positivos ya que no se ingresaron numeros positivos");
	}
	if(contNeg>0) {
		System.out.println("La media de numeros negativos es: "+mediaNeg);
	}
	else {
		System.out.println("No es posible obtener la media de negativos ya que no se ingresaron numeros negativos");
	}
	}
}
