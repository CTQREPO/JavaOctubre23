package com;

import java.util.Scanner;

public class Ejercicio10 {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);

		int sumPos = 0;
		int sumNeg = 0;
		int sumImp = 0;

		for (int i = 1; i <= 20; i++) {
			System.out.print("Ingrese el #" + i + " numero: ");
			int inputNum = reader.nextInt();

			if (inputNum > 0) {
				System.out.println(inputNum + " es positivo");
				sumPos += inputNum;
			} else if (inputNum < 0) {
				System.out.println(inputNum + " es negativo");
				sumNeg += inputNum;
			} else {
				System.out.println(inputNum + " es cero");
			}

			if (inputNum % 2 == 0) {
				System.out.println("es par");
			} else {
				System.out.println("es impar");
				sumImp += inputNum;
			}
		}
		
        System.out.println("Sumatoria de números positivos: " + sumPos);
        System.out.println("Sumatoria de números negativos: " + sumNeg);
        System.out.println("Sumatoria de números impares: " + sumImp);
	}
}
