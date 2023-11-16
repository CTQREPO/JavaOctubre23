package com;

import java.util.Scanner;

public class Eje2_3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase para verificar si es un pal�ndromo: ");
        String palabra = scanner.nextLine();

        // Eliminar espacios y convertir la cadena a min�sculas para hacer la comparaci�n
        String cadenaLimpia = palabra.replaceAll("\\s+", "").toLowerCase();

        // Verificar si la cadena es un pal�ndromo
        boolean esPalindromo = true;
        for (int i = 0; i < cadenaLimpia.length() / 2; i++) {
            if (cadenaLimpia.charAt(i) != cadenaLimpia.charAt(cadenaLimpia.length() - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("�La palabra o frase ingresada es un pal�ndromo!");
        } else {
            System.out.println("La palabra o frase ingresada NO es un pal�ndromo.");
        }

        scanner.close();
    }
}
