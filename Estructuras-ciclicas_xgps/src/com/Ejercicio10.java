package com;
import java.util.Scanner;
public class Ejercicio10 {
public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	int[] numeros= new int[20];
	int sumatoria=0;
	int suma=0;
	System.out.print("Teclee los datos: ");
	for (int i = 0; i < numeros.length; i++) {
		numeros[i]=scanner.nextInt();
		
	}
	for(int i = 0; i<numeros.length; i++){
		if(numeros[i]<0) {
			System.out.println(numeros[i]+"Negativos");
		}else if(numeros[i]>0) {
			System.out.println(numeros[i]+"Positivos");
			
		}
	}
	for (int i = 0; i < numeros.length; i++) {
		if(numeros[i]%2==0) {
			System.out.println(numeros[i]+"Par");
		}else {
			System.out.println(numeros[i]+"Impar");
		}
		
	}
	for (int i = 0; i < numeros.length; i++) {
		if(numeros[i]%2==0) {
			sumatoria=sumatoria+numeros[i];
			}
	}
		System.out.println("La sumatoria de los impar es: "+sumatoria);
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]>0) {
				suma=suma+numeros[i];
				
			}}
			System.out.println("La sumatoria de los positivos es: "+suma);
			
		
	}
}
