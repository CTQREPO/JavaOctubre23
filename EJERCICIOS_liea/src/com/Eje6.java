package com;

import java.util.Scanner;

public class Eje6 {

	public static void main(String[] args) {
		int cantidad;/// cantidad de niños
//		int precio1=65;/// precio de 100 niños o mas
//		int precio2=70;/// precio de 50-99
//		int precio3=95;/// precio de 30-49
//		int precio4=4000;/// precio de menos de 30
		
		int total;
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("ESCRIBE LA CANTIDAD DE NIÑOS QUE VIAJARAN PARA DETERMINAR EL PRECIO DEACUERDO ALOS SIGUIENTES PPAQUETES" );
		System.out.println("PAQUETE 1: 100 NIÑOS A MAS 65$ C/U");
		System.out.println("PAQUETE 2: 50-99 NIÑOS 70$ C/U");
		System.out.println("PAQUETE 3: 30-49 NIÑOS 95$ C/U");
		System.out.println("PAQUETE 4: MENOS DE 30 NIÑOS 4000$");
		
		cantidad=entrada.nextInt();
		
		if(cantidad>=100) {
			total=cantidad*65;
			System.out.println("PRECIO TOTAL "+total);
		}else if(cantidad>=50 && cantidad<=99){
			total=cantidad*70;
			System.out.println("PRECIO TOTAL "+total);
		}else if(cantidad>=30 && cantidad<=49) {
			total=cantidad*95;
			System.out.println("PRECIO TOTAL "+total);
		}else if(cantidad<30) {
			System.out.println("PRECIO TOTAL 4000$");
		}
	}

}
//><