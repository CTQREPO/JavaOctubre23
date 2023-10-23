package com;

public class Cifrado {
	public static void main(String[] args) {

		String mensaje = "Texto de prueba con 570283 algunoz numeros";
		String cifrado = "";
		int conteoVocales = 0;
		String aux = "";
		String numero = "1234567890";
		int num = 0;
		String vocales = "aeiou";
		String[] abc = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };

		// itera sobre el mensaje
		for (int i = 0; i < mensaje.length(); i++) {

			aux = Character.toString(mensaje.charAt(i));
			aux = aux.toLowerCase();
			System.out.println("caracter actual:" + aux);

			// filtrado de numeros de letras

			if (numero.indexOf(aux) >= 0) {
				// convertir el string a entero

				num = Integer.parseInt(aux);

				cifrado = cifrado + (num + 1);

			} else if (aux.equals(" ")) {
				cifrado = cifrado + ">>-";

			} else {

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
				// itera sobre el abecedario para averiguar en que posicion
				// esta el caracter actual

			}

		}

		System.out.println(cifrado);
		System.out.println(conteoVocales);

	}

}
