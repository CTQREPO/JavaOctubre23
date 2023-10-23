package com;

import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		
		 int[] numeros = new int[10]; //Arrays
		 int sumatoria=0;
		 int suma=0;
		 
		 System.out.println("Teclee los datos");
		 for(int i=0; i<numeros.length;i++) {
			 numeros[i]=a.nextInt();
			 
	}
		 
	     for(int i=0; i<numeros.length; i++) {
	    	 if(numeros [i]<0) {
	    		 System.out.println(numeros[i]+"Negativo");
	    	 }else if(numeros[i]>0) {
	    		 System.out.println(numeros[i]+"Positivo");
	    	 }
	     }
	     for(int i=0; i<numeros.length; i++) { // par e impar
	    	 if(numeros[i]%2==0) {
	    		 System.out.println(numeros[i]+"Par");
	    	 }else {
	    		 System.out.println(numeros[i]+"Impar");
	    	 }
	     }
	     
	    	 //sumatoria impar
	    	 		for(int i=0; i<numeros.length; i++) {
	    	 				if(numeros [i]%2==0) {
	    	 					sumatoria=sumatoria+numeros[i];
	    	 				}
	    	 } 
	    	 		System.out.println("la sumatoria de los impar es:" +sumatoria);
	    	 		for(int i=0; i<numeros.length; i++) {
	    		    	 if(numeros [i]>0) {
	    		    		 suma=suma+numeros[i];
	     }
	}
	    	 		System.out.println("la sumatoria de los positivos es:" +suma);
}
}
