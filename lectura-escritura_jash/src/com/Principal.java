package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {
	public static void main(String[] args) {
		String linea="";
		File archivo = new File("C:\\Users\\Kalex\\Desktop\\pruebaA.txt");
		try {//Intenta 
			
			FileWriter wr =new FileWriter(archivo,true);
			wr.write("Esto es una prueba \n");
			
			
//			FileReader fr = new FileReader(archivo);//cache
//			BufferedReader br = new BufferedReader(fr);//sirve para leer por lineas 
//			
//			//Mientras las lineas sean diferentes de null
//			while((linea = br.readLine())!= null) {
//				System.out.println(linea);
//			}
			wr.close();
		} catch (Exception e) {//Atrapa (Maneja) el error
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
