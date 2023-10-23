//Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.
//Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 [m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:

package com;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introdusca su peso");
		double peso = 0;
		peso = scan.nextDouble();
		System.out.println("introdusca su altura");
		double altura = 0;
		altura = scan.nextDouble();
		double imc = peso / Math.pow(altura, 2);
		if (imc < 16) {
			System.out.println("criterio de ingreso al hospital");
		} else if (imc > 16 && imc < 17) {
			System.out.println("infrapeso");
		} else if (imc > 17 && imc < 18) {
			System.out.println("bajo peso");
		} else if (imc > 18 && imc < 25) {
			System.out.println("peso normal (saludable)");
		} else if (imc > 25 && imc < 30) {
			System.out.println("obesidad grado 1");
		} else if (imc > 30 && imc < 35) {
			System.out.println("oesidad grado 2");
		} else if (imc > 35 && imc < 40) {
			System.out.println("obesidad grado 3");
		} else if (imc > 40) {
			System.out.println("obesidad morbida");
		}

	}
}
