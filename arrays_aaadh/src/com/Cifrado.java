package com;

public class Cifrado {

	public static void main(String[] args) {

		String mensaje = "Texto de prueba con 570283 algunos numeros";
		String cifrado = "";
		int conteoVocales = 0;
		String aux = "";
		String numero = "1234567890";
		String vocales = "aeiou";
		int num = 0;
		String[] abc = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };

		// Itera sobre el mensaje
		for (int i = 0; i < mensaje.length(); i++) {
			aux = Character.toString(mensaje.charAt(i));
			aux = aux.toLowerCase();
			System.out.println("Caracter actual:" + aux);
			// Filtrando numeros de letras...

			if (numero.indexOf(aux) >= 0) {
				// Convertit el String a entero
				// 7 "7"
				num = Integer.parseInt(aux);
				cifrado = cifrado + +(num + 1);
			} else if (aux.equals(" ")) {
				cifrado = cifrado + "?";
			} else {
// Itera sobre el abecedario. para averiguar en que posicion 
				if (aux.equals("z")) {
					cifrado = cifrado + "a";
				} else {
					for (int j = 0; j < abc.length; j++) {
						if (aux.equals(abc[j])) {
							cifrado = cifrado + abc[j + 1];
							// conteo de vocales
							if (vocales.indexOf(aux) >= 0) {
								conteoVocales++;
							}

						}

					}
				}
			}
			System.out.println(cifrado);
			System.out.println("Vocales:" + conteoVocales);
		}

	}
}
