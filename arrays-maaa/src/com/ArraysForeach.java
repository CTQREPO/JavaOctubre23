package com;

import java.util.Scanner;

public class ArraysForeach {

	// crea un Array definido por el usuario, despues llenalo con el bucle for
	// despues imprime todos los valores con for y length y con for each

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numElementos;
		
		System.out.println("Digite la cantidad de elementos en el array: ");
		numElementos = entrada.nextInt();
		
		int [] digitos = new int[numElementos];
		
		for (int i = 0; i < numElementos; i++) {
			System.out.println("Digite el elemento ubicado en la posicion "+i);
			digitos [i]= entrada.nextInt();
		}
		for(int digitos2:digitos) {
			System.out.println(digitos2);
		}
	}
}
