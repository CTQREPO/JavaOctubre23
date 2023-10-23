package com;

import java.util.Scanner;

public class EJE4 {

	public static void main(String[] args) {

		int nota, edad;
		char sexo;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("INGRESE LOS SIGUIENTES DATOS PARA EVALUAR SU SOLICTUD");
		
		System.out.println("INGRESE LA NOTA");
		nota = entrada.nextInt();
		
		System.out.println("INGRESE LA EDAD");
		edad = entrada.nextInt();
		
		System.out.println("INGRESE EL SEXO F O M");
		sexo = entrada.next().charAt(0);
		
		//System.out.println("RESULTADO"+nota +"," +edad +","+sexo);
	
		if (nota>=5&&edad>=18&&sexo=='M') {
			System.out.println("POSIBLE");	
		}else if(nota>=5&&edad>=18&&sexo=='F'){
			System.out.println("ACEPTADA");
			
		}else {
			System.out.println("error");
		}
	
	}

}
