package com;

public class Cifrado {
  
	public static void main(String[] args) {
	
		// declaramos variables a utilizar
		
		String mensaje="Texto de prueba con 570283 algunoz numeros";
		String cifrado=""; // llevara el conteo final
		int conteoVocales=0;
		String aux="";  //aux almacena cada letra en la iteracion
		String numeros="1234567890";
		String vocales="aeiou";
		int num=0;
		
		String[] abc= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v",
				"w","x","y","z"};
		
		//comenzar a iterar sobre el primer string (mensaje)
		 for(int i = 0; i < mensaje.length(); i++ ) {     //aislar un caracter a la vez
	//	System.out.println(mensaje.charAt(i));	 
			 aux = Character.toString(mensaje.charAt(i));
			 aux = aux.toLowerCase(); //se convierte a minuscula todas las mayusculas
			 System.out.println("caracter actual:" + aux);
			 
			 
			 //filtrando numeros de letras...
			 if(numeros.indexOf(aux)>=0) { 
				 //convertir el string a entero
				 //     7             "7"
				 num = Integer.parseInt(aux);
				 cifrado = cifrado + (num+1);
			 }else if(aux.equals(" ")) {
				 cifrado= cifrado + ">>-";
			 }else {
				 //itera sobre el abecedario para averiguar en que posicion esta
			
				 if(aux.equals("z")) {
					 cifrado = cifrado + "a";
				 }else{
					 	for(int j = 0; j < abc.length; j++){
				
					 		if(aux.equals(abc[j])) {
					 			cifrado = cifrado + abc[j+1];
					 			
					 			//conteo de vocales
					 			if(vocales.indexOf(aux)>=0) {
					 				conteoVocales++;
					 				
					 			}
					 }
					 }
				 }
				 
				 
			 
			
				 
			 }
			 
			 System.out.println(cifrado);
			 System.out.println(conteoVocales);
			 
		 }
		
}
}
