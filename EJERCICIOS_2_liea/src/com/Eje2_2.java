package com;

import java.util.Scanner;

public class Eje2_2 {

	public static void main(String[] args) {
		int mult;
		int num1;//numero a multiplicar
		int num2;//limite de tabla multiplicador
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("INGRESE EL NUMERO A MULTIPLICAR");
		num1=sc.nextInt();
		
		System.out.println("HASTA QUE VALOR LLEGARA LA MULTIPLICACION");
		num2=sc.nextInt();
		
		for (int i=1; i<=num2; i++) {
			mult=num1*i;
			System.out.println(num1+"*"+i+"="+mult);
		}
	}

}
