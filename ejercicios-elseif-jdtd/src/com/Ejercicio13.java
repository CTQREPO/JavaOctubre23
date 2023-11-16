package com;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int nh;
		int pagot;
		int he;
		
		
		System.out.println("Cuantas horas trabajo esta semana");
		nh = sc.nextInt();
		
		if(nh<=40) {
			pagot=nh*16;
			System.out.println("Su pago de esta semana es: "+pagot);
		}else if(nh>=41){
			
				he=nh-40;
				pagot=(40*16)+(he*20);
				System.out.println("su pago de esta semana es: "+pagot);
			}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
