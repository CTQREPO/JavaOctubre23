package com;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int edad=0;
		int promedio=0;
		int acumulador=0;
		int contador=0;
		int suma=0;
		
		do{
			
			System.out.println("ingrese una edad");
			edad = sc.nextInt();
			suma=suma+edad;
			contador=contador+1;
		    
			promedio=suma /contador;
			if (promedio>25) {
				break;//termina el programa
				
			}
			
		}while(edad>0);
		System.out.println("La suma total de las edades :" + suma    + " edades ingresadas: "+ contador);
		  System.out.println("El promedio es igual a: "+promedio);
		  if (promedio>25) {
		   System.out.println("El promedio fue mayor que 25 y ha finalizado");
		  }else {
		   System.out.println("Reinicia el programa ya que el promedio no fue superior a 25");
	}

}
}
