package com;

import java.util.Scanner;

public class Ejercicio1 {
	 public static void main(String[] args) {
		    Scanner scanner = new Scanner (System.in);
		    int numero1;
		    int numero2;
	
		    System.out.print("Introduce el primer n�mero: ");
		    numero1 = scanner.nextInt();
		    System.out.print("Introduce el segundo n�mero: ");
		    numero2 = scanner.nextInt();
		    
		    if (numero1 > numero2){
		        System.out.println("El n�mero" +numero1 + ", es mayor que el n�mero" +numero2);
		    }else if (numero1 < numero2){
		        System.out.println("El n�mero" +numero2 + ", es mayor que el primer n�mero " +numero1);
		    }else {
		        System.out.println("Ambos n�meros son iguales, " +numero1);
		    }    
		  }
		}