package com;

import java.util.Scanner;

public class NumeroMayor {
	
	public static void main(String[] args) {
		System.out.println("Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales");
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese primer n�mero: ");
        
        int leerNum1 = teclado.nextInt();
        System.out.println("Ingrese segundo n�mero: ");
        
        int leerNum2 = teclado.nextInt();
        
        
        if( leerNum1 == leerNum2 ){
            System.out.println("El primer n�mero " + leerNum1 + " es igual al segundo n�mero " + leerNum2 );
        }
        

        if( leerNum1 > leerNum2 ){
            System.out.println("El n�mero mayor es: " + leerNum1);
        }else if (leerNum2 > leerNum1  ) {
            System.out.println("El n�mero mayor es: " + leerNum2 );
        }
	}
}
