package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {
		
		String linea="";
		
		//OBJETO 
		File archivo = new File("C:\\Users\\angel\\Desktop\\archivoprueba.txt");
		
		try {// Intenta
			FileWriter wr = new FileWriter(archivo,false); // con true mantenemos lo que ya tiene y agregamos y con false sobre esribe lo que ya tenia
			wr.write("Esto es nuevo dentro del archivo\n");
			
			
			
			
			
//			FileReader fr = new FileReader(archivo);//cache
//			BufferedReader br = new BufferedReader(fr);// sirve para leer por linea
//			
//			// comparacion LINEA ES DIFERENTE DE NUL(LO QUE DECLARE QUE ERA LINEA ES DIF DE NULL)
//			while((linea = br.readLine()) !=null) {
//			System.out.println(linea);	// 		
//			}
			wr.close(); //cerrar el archivo
		}catch(Exception ex) {// Atrapa (maneja) el error
		ex.printStackTrace();//Da los detalles de lo que esta haciendo (te dice donde esta el error)
		
		}
		
	}
	
}

