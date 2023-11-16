package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class Principal {
	public static void main(String[] args) {
		String linea="";
		File archivo= new File("C:\\Users\\GABRIELA\\Desktop\\Nota prueba.txt");
		
try {
	// true, agrega el texto en el archivo si es false solo escribe el texto 
	FileWriter wr= new FileWriter(archivo,true);//sobre el archivo desde el disco
	wr.write("Esto es otro texto\n");
	
	
	//Intenta hacerlo si no puedo, entra el catch
//			FileReader fr= new FileReader(archivo);
//			BufferedReader br= new BufferedReader(fr);//leer una linea a la vez
//			//Mientras las lineas sean diferentes de null
//			while ((linea = br.readLine()) !=null) {//pregunta
//				System.out.println(linea);
//			}
	wr.close();//si no se pone, no se guarda.
		}catch(Exception ex) { //Atrapa (maneja) el error, porque no funciono el codigo 
			ex.printStackTrace();
			
		}
	}

}
