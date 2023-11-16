package com.live;

import java.util.Scanner;

public class Eje1 {

	public static void main(String[] args) {
		System.out.println("MOSTRAR EL CUADRADO DE CADA NUMERO Y DETENER HASTE QUE SEA CERO");
		
		int cuad=0;
		int num=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("INGRESE UN NUMERO");
		
		
		while(num>=0) {
			num=entrada.nextInt();
			cuad=num*num;
			System.out.println(num+"="+cuad);
		}
	
	if(!(num>=0)) {System.out.println("fin del programa ");

}}}
