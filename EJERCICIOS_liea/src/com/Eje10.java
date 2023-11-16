package com;

import java.util.Scanner;

public class Eje10 {

	public static void main(String[] args) {

		int peso;
		int total;
		int lugar;

		Scanner entrada = new Scanner(System.in);

		System.out.println("ANOTA EL PESO DE TU PAQUETE");
		peso = entrada.nextInt();

		if (peso < 5) {
			Scanner texto = new Scanner(System.in);

			System.out.println("ESCRIBE EL LUGAR A DONDE VA EL PAQUETE");
			System.out.println("1 América del Norte	24,00 euros");
			System.out.println("2 América Central	20, 00 euros");
			System.out.println("3 América del Sur	21,00 euros");
			System.out.println("4 Europa	10,00 euros");
			System.out.println("5 Asia	18,00 euros");

			lugar = entrada.nextInt();

			switch (lugar) {

			case 1:
				total = peso * 24000;
				System.out.println("PRECIO TOTAL " + total);
				break;

			case 2:
				total = peso * 20000;
				System.out.println("PRECIO TOTAL " + total);
				break;

			case 3:
				total = peso * 21000;
				System.out.println("PRECIO TOTAL " + total);
				break;
			case 4:
				total = peso * 10000;
				System.out.println("PRECIO TOTAL " + total);
				break;
			case 5:
				total = peso * 18000;
				System.out.println("PRECIO TOTAL " + total);
				break;
			default:
				System.out.println("ERROR");

			}
		} else {
			System.out.println("PESO INVALIDO");
		}
	}

}
