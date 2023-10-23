package com.ciclos;

import java.io.IOException;
import java.util.Scanner;

public class ejerciciosciclos_04 {
	public static void main(String[] args) throws IOException {
	/*4.Programa que reciba una frase y una letra por teclado.
	 Deberá retornar como resultado cuántas veces existe esa letra
	 dentro de la frase. Si no existe, imprimir un mensaje “Carácter no encontrado”. */
	
    Scanner sc = new Scanner(System.in);
    
    String texto;
    char caracter;
    int numeroDeVeces = 0;
    
    do {
        System.out.println("INGRESA UNA FRASE: ");
        texto = sc.nextLine();
    } while (texto.isEmpty());
    System.out.print("INGRESA UN CARACTER: ");
    
    caracter = (char) System.in.read();
    numeroDeVeces = contarCaracteres(texto, caracter);
    System.out.println("El caracter " + caracter + " aparece " + numeroDeVeces + " veces");                   
}

public static int contarCaracteres(String cadena, char caracter) {
    int posicion, contador = 0;
    
    posicion = cadena.indexOf(caracter);
    
    while (posicion != -1) { 
        contador++;           
        posicion = cadena.indexOf(caracter, posicion + 1);
    }
    return contador;
}
}