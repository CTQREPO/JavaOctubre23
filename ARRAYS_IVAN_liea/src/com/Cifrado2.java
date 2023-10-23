package com;

public class Cifrado2 {

    public static void main(String[] args) {

        String mensaje = "Texto de prueba con 570283 algunoz numeros";
        String cifrado="";
        String aux = "";
        String numeros = "1234567890";
        String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        // Iterar sobre el mensaje
        for (int i = 0; i < mensaje.length(); i++) {
            aux = Character.toString(mensaje.charAt(i)).toLowerCase();

            if (numeros.indexOf(aux) >= 0) {
                // Verificar si es un número
                cifrado = cifrado + (Integer.parseInt(aux) + 1);
            } else if (aux.equals(" ")) {
                // Si es un espacio
                cifrado = cifrado + "***";
            } else {
                // Iterar sobre el abecedario
                for (int j = 0; j < abc.length - 1; j++) {
                    if (aux.equals(abc[j])) {
                        cifrado = cifrado + abc[j + 1];
                    }
                }
            }
        }

        System.out.println(cifrado);
    }
}
