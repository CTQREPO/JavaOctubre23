package com;

public class Cifrado {

	public static void main(String[] args) {
		
		String mensaje="Texto de prueba con 570283 algunoz numeros";
		String cifrado ="";
		String aux="";
		String  numeros = "1234567890";
		//int conteoVocales=0;
		String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","r","s","t","u","v","x","y","z"};
		int num=0;
		//String[] vocales={"a","e","i","o","u"};

		
		///INTERAR SOBRE  MENSAJE
		for (int i = 0; i < mensaje.length(); i++) {
			aux = Character.toString(mensaje.charAt(i)).toLowerCase();
			//aux = Character.toString(mensaje.charAt(i));
			//System.out.println(aux);
			
			if(numeros.indexOf(aux)>=0) {
				///CONVERTIR STRING A NUMEROS
				num=Integer.parseInt(aux);
				cifrado = cifrado +(num+1);
			}else if(aux.equals(" ")) {// si la cadena encuentra un espacio
					cifrado = cifrado + "***";	
			}else {
				//interar sobre el abecedario para averiguar posicion
				
				for (int j=0; j<abc.length; j++) {
					if(aux.equals(abc[j])) {
						cifrado=cifrado+ abc[j+1];
						//conteo de vocales
						
//						if(vocales.indexOf(aux)>=0) {
//							//conteoVocales++;
						
					}
				}
			}
			
		}
		
		System.out.println(cifrado);
		
		
				}

}
