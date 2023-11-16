package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {
		String linea = "";
		File archivo = new File("C:\\Users\\Andy\\Desktop\\PRUEBA LECTURA DE ARCHIVOS.txt");
		try {// Intenta
			FileWriter wr= new FileWriter(archivo,true);
			wr.write("ESTO ES NUEVO DENTRO DEL ARCHIVO");
			
//	t1		FileReader fr = new FileReader(archivo);//cache
//	t1			BufferedReader br = new BufferedReader(fr);//sirve para leer por lineas
//   t1	         //Mientras las lineas seab diferentes de null
//	t1			while ((linea = br.readLine()) != null) {
//		t1			System.out.println(linea);
//		t1		}
			wr.close();
		} catch (Exception ex) {// Atrapa (maneja)el error
			ex.printStackTrace();
		}
	}
}
