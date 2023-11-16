package com;
import java.util.Scanner;

public class NumerosATexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una serie de números (separados por espacios):");
        String input = scanner.nextLine();

        String[] numeros = input.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String numero : numeros) {   
            try {
                int num = Integer.parseInt(numero);
                String numeroEnTexto = convertirNumeroATexto(num);
                resultado.append(numeroEnTexto).append(" ");
            } catch (NumberFormatException e) {
                System.out.println("Error: \"" + numero + "\" no es un número válido.");
            }
        }

        System.out.println("Números en texto: " + resultado.toString().trim());
    }

    public static String convertirNumeroATexto(int numero) {
        // Array de texto para números del 0 al 19
        String[] unidades = {
            "Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez",
            "Once", "Doce", "Trece", "Catorce", "Quince", "Dieciséis", "Diecisiete", "Dieciocho", "Diecinueve"
        };

        // Array de texto para las decenas
        String[] decenas = {
            "Veinte", "Treinta", "Cuarenta", "Cincuenta", "Sesenta", "Setenta", "Ochenta", "Noventa"
        };

        if (numero < 0 || numero > 99) {
            return "Número fuera de rango";
        }

        if (numero < 20) {
            return unidades[numero];
        } else {
            int unidad = numero % 10;
            int decena = numero / 10;

            if (unidad == 0) {
                return decenas[decena - 2];
            } else {
                return decenas[decena - 2] + " y " + unidades[unidad];
            }
        }
    }
}
