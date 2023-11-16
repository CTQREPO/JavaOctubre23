package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
public class Principal {

	public static void main(String[] args) {
		
		String linea="";
		
		File archivo = new File("C:\\Users\\IVAN\\Desktop\\qwerty.txt");
		
		
		try {//INTENTA
//			FileWriter wr =new FileWriter(archivo, true);
//			wr.write("XD\n");
//			
//			wr.close();
			
			FileReader fr = new FileReader(archivo);
			BufferedReader br =new BufferedReader(fr);
			
			//mientras las lineas sean diferentes de null 
			while((linea = br.readLine()) !=null) {//BRREAD VA A LEER LINEA POR LINEA Y LO GUARDA EN LINEA
				System.out.println(linea);
			}
		}catch(Exception ex) {//ATRAPA (MANEJA) EL ERROR
			ex.printStackTrace();// muestra el error cometido
			
			
			
		}
		
	}

}
