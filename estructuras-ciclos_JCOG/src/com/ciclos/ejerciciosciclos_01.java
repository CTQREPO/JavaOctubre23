package com.ciclos;

import java.util.Scanner;

public class ejerciciosciclos_01 {
public static void main(String[] args) {
//1.- Programa un algoritmo que realice la tabla de multiplicar del 12
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("INGRESE UN NUMERO DEL 1 al 10");
	int numero = sc.nextInt();
	
	
	if (numero <= 0 || numero >= 11) {
			System.out.println("ERROR NUMERO INCORRECTO");
		}else if(numero == 1){
			numero = numero * 12;
			System.out.println("el resultado es: "+numero);			
		}else if(numero == 2){
			numero = numero * 12;
			System.out.println("el resultado es: "+numero);			
		}else if(numero == 3){
			numero = numero * 12;
			System.out.println("el resultado es: "+numero);			
		}else if(numero == 4){
			numero = numero * 12;
			System.out.println("el resultado es: "+numero);			
		}else if(numero == 5){
			numero = numero * 12;
			System.out.println("el resultado es: "+numero);			
		}else if(numero == 6){
			numero = numero * 12;
			System.out.println("el resultado es: "+numero);			
		}else if(numero == 7){
			numero = numero * 12;
			System.out.println("el resultado es: "+numero);			
		}else if(numero == 8){
			numero = numero * 12;
			System.out.println("el resultado es: "+numero);			
		}else if(numero == 9){
			numero = numero * 12;
			System.out.println("el resultado es: "+numero);			
		}else if(numero == 10){
			numero = numero * 12;
			System.out.println("el resultado es: "+numero);			
		}
}
}
