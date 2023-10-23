package com;

//import java.util.Arrays;
import java.util.Scanner;

public class Eje9 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
	    
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingresa dos numeros para mostrar los pares entre ellos");
		num1=entrada.nextInt();
		num2=entrada.nextInt();
        //int[] numeros = new int[Math.abs(num1-num2)];
        
		for (int i = num1; i < num2+1; i++) {
			
			if(i%2==0) {
			System.out.println(i);
			}

		}
	



	}

}
