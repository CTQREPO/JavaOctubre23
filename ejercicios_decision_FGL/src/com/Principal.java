package com;

// import java.util.Scanner;

public class Principal {

//	private static Scanner reader;

	public static void main(String[] args) {

//		reader = new Scanner(System.in);

//		tabla de multiplicar

//		int numUno = 0;
//		int numDos = 0;
//
//		System.out.println("Ingres el numero a mutiplicar");
//		numUno = reader.nextInt();
//		System.out.println("Iteracion deseado");
//		numDos = reader.nextInt();
//		
//		for (int i = 1; i <= numDos; i++) {
//			System.out.println(numUno + " * " + i + " = " + (numUno * i));
//		}

		String cadena = "kjbwe4786109bc9786tcr23b408ym9y=)?=)?5430o123)·!%·$8976+-`+!=?^_8798o8";

		String caracter = "";
		int c0 = 0;
		int c1 = 1;
		int c2 = 2;
		int c3 = 3;
		int c4 = 4;
		int c5 = 5;
		int c6 = 6;
		int c7 = 7;
		int c8 = 8;
		int c9 = 9;

		for (int i = 0; i < cadena.length(); i++) {
			caracter = Character.toString(cadena.charAt(i));
			System.out.println(caracter);
			switch (caracter) {
			case "0":
				c0++;
				break;
			case "1":
				c1++;
				break;
			case "2":
				c2++;
				break;
			case "3":
				c3++;
				break;
			case "4":
				c4++;
				break;
			case "5":
				c5++;
				break;
			case "6":
				c6++;
				break;
			case "7":
				c7++;
				break;
			case "8":
				c8++;
				break;
			case "9":
				c9++;
				break;
			}
		}

		System.out.println("El 0 estuvo " + c0 + " veses");
		System.out.println("El 1 estuvo " + c1 + " veses");
		System.out.println("El 2 estuvo " + c2 + " veses");
		System.out.println("El 3 estuvo " + c3 + " veses");
		System.out.println("El 4 estuvo " + c4 + " veses");
		System.out.println("El 5 estuvo " + c5 + " veses");
		System.out.println("El 6 estuvo " + c6 + " veses");
		System.out.println("El 7 estuvo " + c7 + " veses");
		System.out.println("El 8 estuvo " + c8 + " veses");
		System.out.println("El 9 estuvo " + c9 + " veses");
	}
}
