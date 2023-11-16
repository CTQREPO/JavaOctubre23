package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {
	
	public static void main (String[] args) {
		
		String linea="";	
		
		File archivo = new File("C:\\Users\\arian\\Desktop\\prueba lectura-escritura.txt");
		
		try { //Intenta
			
			FileWriter wr = new FileWriter(archivo, true); //si tiene true conserva lo que tiene el archivo, pero si es false va a borrar todo lo que tiene el archivo
			wr.write("Esto es nuevo dentro del archivo");
		
		/*	FileReader fr = new FileReader(archivo); //cache
			BufferedReader br = new BufferedReader(fr); //sirve para leer por lineas
			
			//Mientras las lineas sean diferentes de null
			while( ( linea = br.readLine()) != null ) {
				System.out.println(linea);
			}  */
			
			wr.close();
				
		} catch(Exception ex) { //Atrapa (maneja) el error
			ex.printStackTrace(); //esta linea de comando nos muestra por que no funciona nuestro codigo, dentro del metodo try
			
		}
			
				
	}

}
