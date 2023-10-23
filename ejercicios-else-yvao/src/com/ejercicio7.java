package com;
import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		
		int resultado;
		String A="Uno";
		String B="Dos";
		String C="Tres";
		String D="Cuatro";
		String E="Cinco";
		String F="Seis";
		
		System.out.println("Teclee el resultado del dado:");
		resultado = a.nextInt();
		
		if(resultado==1){
		System.out.println(F);
		}else if(resultado==6) {
			System.out.println(A);
		}else if(resultado==2) {
			System.out.println(E);
		}else if(resultado==5) {
			System.out.println(B);
		}else if(resultado==3) {
		    System.out.println(D);
		}else if(resultado==4) {
			System.out.println(C);
		}else {
			System.out.println("Error");
		}
			
		
			
	}
}
