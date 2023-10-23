package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import jdk.jfr.events.FileWriteEvent;

public class Principal {

	public static void main(String[] args) {
		String linea = "";
		File archivo = new File("C:\\\\Users\\\\ThinkPad\\\\Desktop\\\\prueba.txt");
		try {
			FileWriter wr = new FileWriter(archivo, false);
			
			wr.write("Esto es nuevo dentro del archivo");
			wr.close();
//			FileReader fr = new FileReader(archivo);
//			BufferedReader br = new BufferedReader(fr);
//
//			while ((linea = br.readLine()) != null) {
//				System.out.println(linea);
//			}
			
			// crear dos archivos 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
