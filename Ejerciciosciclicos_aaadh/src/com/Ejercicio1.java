//Programa un algoritmo que realice la tabla de multiplicar del 12
package com;

public class Ejercicio1 {
	public static void main(String[] args) {
		int contador = 0;
		int tabla = 12;
		int resultado = 0;
		while (contador < 11) {
			System.out.println(12 * contador);
			resultado = tabla * contador;
			contador++;
		}
		System.out.println(resultado);
	}
}
