package com;

import java.util.Scanner;

public class Eje2_3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase para verificar si es un palíndromo: ");
        String palabra = scanner.nextLine();

        // Eliminar espacios y convertir la cadena a minúsculas para hacer la comparación
        String cadenaLimpia = palabra.replaceAll("\\s+", "").toLowerCase();

        // Verificar si la cadena es un palíndromo
        boolean esPalindromo = true;
        for (int i = 0; i < cadenaLimpia.length() / 2; i++) {
            if (cadenaLimpia.charAt(i) != cadenaLimpia.charAt(cadenaLimpia.length() - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("¡La palabra o frase ingresada es un palíndromo!");
        } else {
            System.out.println("La palabra o frase ingresada NO es un palíndromo.");
        }

        scanner.close();
    }
}
