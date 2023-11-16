package com;

import java.util.Scanner;

public class suma_resta_mul_div {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // SIRVE PARA ESCANEAR DATOS QUE EL USUARIO VA A INGRESAR
	
		float num1, num2, suma, resta, mult, div;
		
		System.out.println("DIGITA DOS NUMEROS");
		num1 = entrada.nextFloat();
		num2 = entrada.nextFloat();
		
		suma = num1 + num2;
		resta = num1 - num2;
		div = num1/num2;
		mult = num1*num2;
		
		System.out.println("LA SUMA ES "+suma);
		System.out.println("LA RESTTA ES "+resta);
		System.out.println("LA MULTIPLICACION ES "+mult);
		System.out.println("LA DIVISION ES "+div);
	
	}


}
