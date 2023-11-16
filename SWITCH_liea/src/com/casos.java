package com;

import java.util.Scanner;

public class casos {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int dato;
		
		System.out.println("DIGITA UN DATO entre 1 - 3");
		dato = entrada.nextInt();
		
		switch(dato) { 
		case 1 : System.out.println("INCORRECTO");
		break;
		
		case 2 : System.out.println("CORRECTO");
		break;
		
		case 3 : System.out.println("INCORRECTO");
		break;
		
		}
		
	}

}
