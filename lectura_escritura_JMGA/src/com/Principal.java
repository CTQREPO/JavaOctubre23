package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {
	public static void main(String[] args) {
		
		String linea="";
		File archivo = new File ("C:\\Users\\Juan\\Desktop\\PruebaLectura.txt");

		try {//intenta
			
			FileWriter wr = new FileWriter(archivo, /*true*/false);//true agrega mas lo que había, false sobre escribe y borra todo 
			wr.write("Esto es una nueva escritura en el archivo ");
			
			
			
			
			
			
		/*	FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			
			
			//miestras las lienas sean dferentes de pool 
			while ((linea = br.readLine())!= null) {
			System.out.println(linea);
			}*/
			
			wr.close();
		} catch (Exception ex) {//atrapa y maneja el error 
			ex.printStackTrace();//dame los detalles de o que está ásando 
		}
		
		
		
		
		
		
		
		
		
	}

}
