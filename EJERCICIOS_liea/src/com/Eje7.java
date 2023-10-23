package com;

import java.util.Scanner;

public class Eje7 {
	public static void main(String[] args) {
	
		int cara;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("INGRESE EL VALOR OBTENIDO EN EL DADO PARA CONOCER EL LADO CONTRARIO");
		cara=entrada.nextInt();
		
		switch(cara) {
		case 1:
			System.out.println("SEIS");
			break;
		
		case 2:
			System.out.println("CINCO");
			break;
			
		case 3:
			System.out.println("CUATRO");
			break;
			
		case 4:
			System.out.println("TRES");
			break;
			
		case 5:
			System.out.println("DOS");
			break;
			
		case 6:
			System.out.println("UNO");
			break;
			
		}
	}


}
