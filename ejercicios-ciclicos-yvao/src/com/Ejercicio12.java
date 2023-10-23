package com;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		
		int edad=0;
		int promedio=0;
		int acumulador=0;
		int contador=0;
		int suma=0;
				
		do {
			
			System.out.println("Teclee su edad");
			edad = a.nextInt();
			
			suma=suma+edad; // suma el resultado 
			contador=contador+1;
			
			promedio=suma/contador;
			if(promedio>25) {
				break;// termina el programa
		}
		}while(edad>0);
		System.out.println("La suma de las edades es :" +suma);
		System.out.println("Edades ingresadas:"+ contador);
		System.out.println("El promedio es igual a:" + promedio);
		if(promedio>25) {
			System.out.println("El promedio es mayor a 25");
		}else {
			System.out.println("El promedio no fue superior a 25");
		
			
		}
		
	}
}
