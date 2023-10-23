package com;
import java.util.Scanner;
public class Ejercicio10 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
	    int a;
	    double maleta;
	    System.out.println("Teclee el lugar");
	    System.out.println("1.- America del norte");
	    System.out.println("2.- America Central");
	    System.out.println("3.- America del Sur");
	    System.out.println("4.- Europa");
	    System.out.println("5.- Asia");
	    a = scanner.nextInt();
	    System.out.println("Teclee el peso de su equipaje");
	    maleta = scanner.nextDouble();
	    
	    if(maleta<=5&&maleta>=0) {
	        switch(a) {
	        case 1:
	        	System.out.println("El precio de su servicio es de");
	        	System.out.println("$"+(maleta*24));;
	        	break;
	        case 2:
	        	System.out.println("El precio de su servicio es de");
	        	System.out.println("$"+(maleta*20));
	        	break;
	        case 3:
	        	System.out.println("El precio de su servicio es de");
	        	System.out.println("$"+(maleta*21));
	        	break;
	        case 4:
	        	System.out.println("El precio de su servicio es de");
	        	System.out.println("$"+(maleta*10));
	        	break;
	        case 5:
	        	System.out.println("El precio de su servicio es de");
	        	System.out.println("$"+(maleta*18));
	        	break;
	        	
	        	
	        }
	    if(maleta>5) {
	    	System.out.println("Rechazado por exceso de peso");
	    }	
	    }
	 else {
		System.out.println("Opcion no valida");
	    
	} 
}}

