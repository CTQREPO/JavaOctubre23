package com.live;

import java.util.Scanner;

public class Ref2 {

	public static void main(String[] args) {
		
		int num=0;
		int val=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("indicar para o impar hasta que llegue un 0");
		
		System.out.println("INGRESE NUMMERO");
		
		while(!(num==0)) {
			num=entrada.nextInt();
			if(num>0) {
				System.out.println(num+" par");
			}else {
				System.out.println(num+" impar");
			}
		}//System.out.println("fin de programa");
	

	}

}
