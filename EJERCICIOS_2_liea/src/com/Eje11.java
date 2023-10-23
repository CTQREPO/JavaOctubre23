package com;

import java.util.Arrays;
import java.util.Scanner;

public class Eje11 {

	public static void main(String[] args) {


		double [] array = new double[10];
		double suma=0;
		double sumapos=0;

		
		
		Scanner entrada = new Scanner(System.in); // ESCANEA EL DATO PROPORCIONADO POR EL USUARIO
		
		System.out.println("INGRESA 10 NUMEROS");
		
		for (int i = 0; i < array.length; i++) {
			array[i]=entrada.nextDouble();
			}
////////////////////////////////////////////////////////////////////////////////////////////////		
		for (int i = 0; i < array.length; i++) {
			if(array[i]<0) {
				System.out.println(array[i]+" NEGATIVO");	
		}else if(array[i]>0){
			System.out.println(array[i]+" POSITIVO");
		}

}
/////////////////////////////////////////////////////////////////////////////////////////////////		///////
		for (int i = 0; i < array.length; i++) {
			
			if(array[i]%2==0) {
			System.out.println(array[i]+" PAR");
		}else {
			System.out.println(array[i]+" IMPAR");
		}
	
	}
///////////////////////////////////////////////////////////////////////////////////////////////		
		for (int i = 0; i < array.length; i++) {
		if(!(array[i]%2==0)) {
			suma=suma+array[i];
		}
		}
			System.out.println("La suma de impares es "+suma);
	
///////////////////////////////////////////////////////////////////////////////////////////////		
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]>0) {
				sumapos=sumapos+array[i];
				}
				}
				System.out.println("La suma de positivos es "+sumapos);		
		
				try {
		            // Pausa la ejecución durante 1 segundo (1000 milisegundos)
		            Thread.sleep(1000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}}
