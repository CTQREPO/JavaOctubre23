package com;

import java.util.Scanner;

public class Eje5 {

	public static void main(String[] args) {

		double total;
		double precio;
		int tamaño; //tamaño de uva
		char tipo; //tipo de uva
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("INGRESE EL PRECIO DE LA UVA");
		precio=entrada.nextDouble();
		
		
		System.out.println("INGRESE EL TIPO DE UVA (A O B)");
		tipo=entrada.next().charAt(0);
		
		System.out.println("INGRESAR EL TAMAÑO DE UVA (TAMAÑO 1 TAMAÑO 2)");
		tamaño=entrada.nextInt();
		

		switch(tipo) {
///////////////////////////////////////////////////////////////////////		 
		case 'A':
			if(tamaño==1) {
				
			total=precio+0.20;
			System.out.println(total);
		}
			else if(tamaño==2){
			total=precio+0.30;
			System.out.println(total);
		}
		else {
			System.out.println("ERROR");
		}
			break;
/////////////////////////////////////////////////////////////////////			
		case 'B':
			if(tamaño==1) {
				
				total=precio-0.30;
				System.out.println(total);
			}
			else if(tamaño==2){
				total=precio-0.50;
				System.out.println(total);
			}
			else {
				System.out.println("ERROR");
			}
			
				break;
/////////////////////////////////////////////////////////////////////          
		default: System.out.println("error");
		}	

		}
	//System.out.println("RESULTADO"+precio +"," +tamaño +","+tipo);
		

		
	}


