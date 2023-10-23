package com;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int numeros[]= new int [10];
		int sumatoria=0;
		int suma=0;
		System.out.println("ingrese los datos");
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]<0) {
				System.out.println(numeros[i]+"negativo");
			}else if(numeros[i]>0) {
				System.out.println(numeros[i]+"positivo");
			}
			
		}
		for(int i=0;i<numeros.length;i++) {////PAR impar
			if(numeros[i]%2==0) {
				System.out.println(numeros[i]+"par");
			}else {
				System.out.println(numeros[i]+"impar");
			}
			
		}
		// sumatoria impar
		for(int i=0;i<numeros.length;i++) {
			if(!(numeros[i]%2==0)) {
				sumatoria=sumatoria+numeros[i];
			
			}
			
		}
		System.out.println("la sumatoria de los impares es: "+sumatoria);
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]>0) {
				suma=suma+numeros[i];
			
			}
			
		}
		
		System.out.println("LA sumatoria de los positivos son: "+suma);
		
		
	}

	
}
