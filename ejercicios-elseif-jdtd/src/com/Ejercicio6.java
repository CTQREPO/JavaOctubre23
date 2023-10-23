package com;
import java.util.Scanner;
public class Ejercicio6 {
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		int A= 0;	 
		int total =0;
		
		System.out.println("ingrese el numero de Alumnos que van a viajar ");
		 A = sc.nextInt();
			
		 if(A>=100) {
			 System.out.println("El costo total por alumno es de 65 euros");
			     total = A * 65 ;
			 System.out.println("el total de la renta del autobus es de: "+ total);
			 }else if (A>=50 && A<=99) {
				 System.out.println("El total por alumno es de 70 euros");
				 total = A * 70 ;
				 System.out.println("el total de la renta del autobus es de: "+ total);
			 }else if(A>=30 && A<=49) {
				 System.out.println("El total por alumno es de 95 euros:");
				 total = A * 95 ;
				 System.out.println("el total de la renta del autobus es de: "+ total);
			 }else if(A>=1 && A<=29) {
				 total = 4000 / A;
				 System.out.println("El precio por alumno es:"+ total);
			 } else {
				 System.out.println("Ingreso un numero incorrecto");
			 }
		
		
		
		
		
		
		
		
		
		
		
	}

}
