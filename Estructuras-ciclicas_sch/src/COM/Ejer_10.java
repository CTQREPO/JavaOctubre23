package COM;

import java.util.Scanner;

public class Ejer_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[20];
		int impar = 0;
		int positivo = 0;		
		System.out.println("Teclee los 20 datos a evaluar");
		for (int i = 0; i < 20; i++) {
		numeros[i] = scanner.nextInt();
		}	
		
		for (int i = 0; i < numeros.length; i++){		 
			if(numeros[i]>0) {
				System.out.println("El numero "+numeros[i]+" es positivo");
			}else if(numeros[i]<0) {
				System.out.println("El numero "+numeros[i]+" es negstivo");
			}
		}
		for (int i = 0; i < numeros.length; i++){		 
			if(numeros[i]%2==0) {
				System.out.println("El numero "+numeros[i]+" es par");
			}else if(numeros[i]<0) {
				System.out.println("El numero "+numeros[i]+" es impar");
			}
		}
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]%2==0) {
				impar=impar+numeros[i];
			}
			
		}
		System.out.println("La suma de los impares es:"+impar);
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]>0) {
				positivo=positivo+numeros[i];
			}
		}
		System.out.println("La suma de los positivos es:"+positivo);
	}
}
