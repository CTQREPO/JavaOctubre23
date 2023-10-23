package com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

public class Principal {
	public static void main(String[] args) {
		
		String linea="";
		
		File archivo = new File("C:\\Users\\elect\\OneDrive\\Escritorio\\prueba.txt");
		
		try {//intenta
			FileWriter wr = new FileWriter(archivo, true);// mantenemos lo que ya habia y agregamos  pero si el true
			wr.write("ESTO ES NUEVO DENTRO DEL ARCHIVO");//cambia por false sobreescribe el texto por el que se agrega
			
			
//			FileReader fr = new FileReader(archivo);
//			BufferedReader br= new BufferedReader(fr);
//			//mientras la lineas sean diferentes de null
//			while((linea = br.readLine()) !=null) {
//				System.out.println(linea);
//			}
			wr.close();
		}catch(Exception ex) {  //atrapa (maneja) el error
			ex.printStackTrace();//da los detalles de lo que esta haciendo
			
		}
		
	}

}
