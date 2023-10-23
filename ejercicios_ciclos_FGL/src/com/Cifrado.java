package com;

public class Cifrado {

	public static void main(String[] args) {

		String mensaje = "Texto de prueba con 570289 algunoz numeros";
		String cifrado = "";
		String aux = "";
		String numeros = "1234567890";
		int conteoVocales = 0;
		int num = 0;
		String vocales = "aeiou";
		String[] abc = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };

		// Itera sobre el mensaje
		for (int i = 0; i < mensaje.length(); i++) {
			aux = aux.toLowerCase();
			aux = Character.toString(mensaje.charAt(i));
			// filtrar numeros de letras
			if (numeros.indexOf(aux) >= 0) {
				// convetir el String a entero
				num = Integer.parseInt(aux);
				cifrado = cifrado + (num + 1);
			} else if (aux.equals(" ")) {
				cifrado = cifrado + "--";
			} else {
				// Iterar sobre el abeedario
				if (aux.equals("z")) {
					cifrado = cifrado + "a";
				} else {
					for (int j = 0; j < abc.length; j++) {
						if (aux.equals(abc[j])) {
							cifrado = cifrado + abc[j + 1];
							if (vocales.indexOf(aux) >= 0) {
								conteoVocales++;
							}
						}
					}
				}
			}
		}
		System.out.println(cifrado);
		System.out.println("Total de vocales: " + conteoVocales);
	}
}
