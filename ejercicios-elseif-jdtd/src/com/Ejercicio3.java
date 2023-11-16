package com;
import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		float x = 0;
		float y = 0;
		
		System.out.println("ingrese un numero:");
		 x = sn.nextFloat();
		 System.out.println("ingrese un numero:");
		 y = sn.nextFloat();
		  if(y==0) {
			  System.out.println("error");
		  }else {
			  System.out.println("el resultado: "+ x/y);
		  }
		
		
		
	}

}
