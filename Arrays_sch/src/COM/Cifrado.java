package COM;

public class Cifrado {
	public static void main(String[] args) {

		String mensaje = "Texto de prueba con 570283 algunoz numeros";
		String cifrado = "";
		String aux = "";
		String numeros = "1234567890";
		int letra=0;
		int num = 0;
		int conteoVocales = 0;
		String vocales="aeiou";
		String[] abc = { "a", "b", "c","e", "d", "f", "g", "h", "i", "j", "k", "l", "m", "n","ñ", "ñ", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "w", "x", "y", "z" };
		// Itera sobre el mensaje
		for (int i = 0; i < mensaje.length(); i++) {
			System.out.println(mensaje.charAt(i));
			aux = Character.toString(mensaje.charAt(i));
			aux = aux.toLowerCase();

			// System.out.println("caracter actual"+aux);

			// Filtrado numero de letras...
			// if(aux.equals("1")||aux.equals("2")) busqueda en texto
			if (numeros.indexOf(aux) >= 0) {
				// Convertir el string a entero
				// variable= numero entero(caracter)

				num = Integer.parseInt(aux);

				cifrado = cifrado + (num );

			} else if (aux.equals(" ")) {
				cifrado = cifrado + "<";
			} else {

				// Itera sobre el abcedario, para averiguar en que posicion
				// esta el caracter actual
				if (aux.equals("a")) {
					letra++;

//				} else {
//					for (int j = 0; j < abc.length; j++) {
//
//						if (aux.equals(abc[j])) {
//							cifrado = cifrado + abc[j + 1];
//							//conteo de vocales
//							if(vocales.indexOf(aux)>=0) {
//								conteoVocales++;
							}

						}
					}
				

			
		

		System.out.println(cifrado);
		System.out.println("Vocales: "+letra);
	}
}
