package com;
import java.util.Scanner;
public class Ejercicio7 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int  N =0 ;
		String A = "Uno";
		String B = "Dos";
		String C = "Tres";
		String D = "Cuatro";
		String E = "Cinco";
		String F = "Seis";
		
		System.out.println("ingrese el numero del dado: ");
	     	N = sc.nextInt();
	     	
	   if(N==1) {
		   System.out.println(F);
	   }else if(N==6) {
		   System.out.println(A);
	   }else if(N==2) {
		   System.out.println(E);
	   }else if(N==5) {
		   System.out.println(B);
	   }else if(N==3) {
		   System.out.println(D);
	   }else if(N==4) {
		   System.out.println(C);
	   }else {
		   System.out.println("el numero no pretenece a un dado de 6 caras ");
	   }
	   
	   
		
		
		
		
		
		
		
		
		
	}

}
