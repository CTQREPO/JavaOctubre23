package com;

public class cifrado {
	public static void main(String[] args) {
		
		String mensaje = "texto de prueba con 570283 algunoz numeros";
		String cifrado = "";
		int conteoVocales=0;
		String aux="";
		String vocales ="aeiou";
		int num=0;
		
		String numeros = "1234567890";
		String[] abc = {"a","b","c","d","e","f","g","h","i","j",
				"k","l","m","n","ñ","o","p","q","r","s","t","u",
				"v","w","y","z"};
		
		//Itera sobre el mensaje
		for (int i = 0; i < mensaje.length(); i++) {
			aux = Character.toString(mensaje.charAt(i));
			System.out.println("Caracter Actual:"+aux.toLowerCase());
			
			//Filtrando numeros de letras ...
			if(numeros.indexOf(aux)>=0) {
				//Convertir el caracter a entero
				num = Integer.parseInt(aux);
				cifrado=cifrado+(num+1);
			}else if(aux.equals(" ")) {
				cifrado = cifrado+">>-";				
			}else {
				//itera sobre el avecedario, para averiguar en que posicion
				//esta el caracter actual
				
				if(aux.equals("z")) {
					cifrado =cifrado+"a";
				}else {
					for (int j = 0; j < abc.length; j++) {
						

						if(aux.equals(abc[j])) {
							cifrado = cifrado + abc[j+1];
							if(vocales.indexOf(aux)>=0) {
								conteoVocales++;
							}
						}
					}
				}

			}
		}
		System.out.println(cifrado);
		System.out.println("vocales es : "+conteoVocales);
	}
}
