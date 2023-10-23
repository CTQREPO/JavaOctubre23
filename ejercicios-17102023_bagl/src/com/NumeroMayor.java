package com;

import java.util.Scanner;

public class NumeroMayor {
	
	public static void main(String[] args) {
		System.out.println("Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales");
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese primer número: ");
        
        int leerNum1 = teclado.nextInt();
        System.out.println("Ingrese segundo número: ");
        
        int leerNum2 = teclado.nextInt();
        
        
        if( leerNum1 == leerNum2 ){
            System.out.println("El primer número " + leerNum1 + " es igual al segundo número " + leerNum2 );
        }
        

        if( leerNum1 > leerNum2 ){
            System.out.println("El número mayor es: " + leerNum1);
        }else if (leerNum2 > leerNum1  ) {
            System.out.println("El número mayor es: " + leerNum2 );
        }
	}
}
