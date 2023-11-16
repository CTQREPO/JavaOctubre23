package com;

import java.util.Scanner;

public class Eje9 {

	public static void main(String[] args) {
		
		int mes;
		Scanner entrada = new Scanner(System.in);
		System.out.println("ESCRIBE EL NUMERO DEL MES (1-12) PARA SABER CUANTOS DIAS TIENE");
		mes=entrada.nextInt();
		
		if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12) {
			System.out.println("EL MES TIENE 31 DIAS");
		}else if(mes==4||mes==9||mes==6||mes==11) {
			System.out.println("EL MES TIENE 30 DIAS");
		}else if(mes==2) {
			System.out.println("EL MES TIENE 28 DIAS");
		}else {
			System.out.println("MES INCORRECTO");
		}
	}

}
