package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class lectura_escritura {
public static void main(String[] args) {
	
	String linea="";
	
	File archivo = new File("C:\\Users\\carlo\\Desktop\\carpeta1\\prueba1.1.txt");
	
	try { //intenta
		
					//TRUE mantiene el texto y agrega // FALSE borra el texto anterior y agrega
	/*	FileWriter wr = new FileWriter(archivo,true);		 //escritura
		wr.write("ESTO ES NUEVO DENTRO DEL ARCHIVO"); 		//RESULTADOS DENTRO DEL ARCHIVO
		//   \n con salto de linea sobre escribe a la siguiente fila. */
		
		
		FileReader fr = new FileReader(archivo); //cache
		BufferedReader br = new BufferedReader (fr); //sirve para leer por lineas
		
		//mientras las lineas sean diferentes de null
		while((linea=br.readLine()) !=null) { 
			System.out.println(linea);
		
		}
		
		//wr.close();		
	}catch(Exception ex) {//atrapa (maneja) el error
		ex.printStackTrace(); //Da los detalles del error
		
		
}
}
}