package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {
		String linea="";
		File archivo = new File("C:\\Users\\Usuario\\Desktop\\Prueba lectura y escritura.txt");
		
		try { //Intenta
			FileWriter wr = new FileWriter(archivo,true);
			wr.write("ESTO ES NUEVO DENTRO DEL ARCHIVO");
//			FileReader fr = new FileReader(archivo);
//			BufferedReader br = new BufferedReader(fr);
//			
//			//Mientras las lineas sean diferentes de null
//			while( (linea = br.readLine()) !=null) {
//				System.out.println(linea);
//			}
			wr.close();
		}catch(Exception ex) { //Atrapa (maneja) el error
			ex.printStackTrace();
		}
	}

}
