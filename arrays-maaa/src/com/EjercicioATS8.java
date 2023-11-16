package com;

import java.util.Scanner;

public class EjercicioATS8 {

	//Solicitar 9 numeros para meter en un arreglo. Luego pedir un numero y una posicion
	//Colocar el numero y desplazar los demas
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero [] = new int[10];
		
		for (int i = 0; i < 9; i++) {
			System.out.println("Digite un numero: ");
			numero[i]=entrada.nextInt();
			
		}
		
		System.out.println("Digite una posicion: ");
		int posicion = entrada.nextInt();
		System.out.println("Digite un numero: ");
		int faltante= entrada.nextInt();
		

			for (int i = 0; i < posicion; i++) {
				numero[i]=numero[i+1];
				
			}
			numero[posicion]=faltante;
			for (int i = 0; i < numero.length; i++) {
				System.out.println(numero[i]);
			}
	
	}
}
