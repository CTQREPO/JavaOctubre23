package com;

import java.util.Scanner;

public class EjercicioATS3 {

	//Meter 5 numeros, contar los 0 y sacar promedio de positivos y negativos
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float numeros [] = new float [5];
		float sumPos=0, sumNeg=0;
		int cont0 = 0, contPos = 0, contNeg = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite un numero: ");
			numeros [i] = entrada.nextFloat();
			
			if (numeros [i] == 0) {
				cont0++;
			}
			else if(numeros[i] > 0) {
				sumPos+=numeros[i];
				contPos++;
			}
			else if(numeros[i] < 0) {
				sumNeg+=numeros[i];
				contNeg++;
			}
		}
		System.out.println("La cantidad de 0 introducidos es "+cont0);
		if(contNeg>0) {
		System.out.println("El promedio de los numeros negativos introducidos es: "+(sumNeg/contNeg));
		}else if(contNeg==0){
			System.out.println("No se introdujeron numeros negativos");
		}
		if(contPos>0) {
			System.out.println("El promedio de los numeros positivos introducidos es: "+(sumPos/contPos));
			}else if(contPos==0){
				System.out.println("No se introdujeron numeros positivos");
			}
		
	}
}
