package com;

import java.util.Scanner;

public class Eje5 {

	public static void main(String[] args) {

		double total;
		double precio;
		int tama�o; //tama�o de uva
		char tipo; //tipo de uva
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("INGRESE EL PRECIO DE LA UVA");
		precio=entrada.nextDouble();
		
		
		System.out.println("INGRESE EL TIPO DE UVA (A O B)");
		tipo=entrada.next().charAt(0);
		
		System.out.println("INGRESAR EL TAMA�O DE UVA (TAMA�O 1 TAMA�O 2)");
		tama�o=entrada.nextInt();
		

		switch(tipo) {
///////////////////////////////////////////////////////////////////////		 
		case 'A':
			if(tama�o==1) {
				
			total=precio+0.20;
			System.out.println(total);
		}
			else if(tama�o==2){
			total=precio+0.30;
			System.out.println(total);
		}
		else {
			System.out.println("ERROR");
		}
			break;
/////////////////////////////////////////////////////////////////////			
		case 'B':
			if(tama�o==1) {
				
				total=precio-0.30;
				System.out.println(total);
			}
			else if(tama�o==2){
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
	//System.out.println("RESULTADO"+precio +"," +tama�o +","+tipo);
		

		
	}


