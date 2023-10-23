package com;

import java.util.Scanner;

public class EJE13 {

	public static void main(String[] args) {
		int horas;
		int total;
		int paga=16;
		int pagaex=20;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("INGRESA LAS HORAS TRABAJADAS");
		horas=entrada.nextInt();
		
		if(horas<=40) {
			total=horas*paga;
			System.out.println("TOTAL $"+total);
		}else {
			total=640+((horas-40)*20);
			System.out.println("TOTAL $"+total);
		}

	}

}
