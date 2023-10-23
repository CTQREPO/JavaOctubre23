package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {

		
		String linea = "";
		
		
		
//		La clase File sale del paquete java io
		
		File archivo = new File ("C:\\Users\\abrng\\OneDrive\\Escritorio\\p_JavaFileRW.txt");
		try {
			
			FileWriter wr = new FileWriter (archivo, true );
			wr.write("\nEsto es escrito por programa");
			
//			FileReader fr = new FileReader (archivo );
//			BufferedReader br = new BufferedReader (fr);
//			while ((linea = br.readLine()) != null ) {
//				System.out.println(linea);
//				
//			}
			wr.close();
			
		}catch (Exception ex) {
			//ex.printStackTrace();
			System.out.println("\nManeja error");
			
		}
	}

}
