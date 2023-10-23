package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Ejerciciofechas {

	public static void main(String[] args) {
		//declaras variables a ocupar
		
	 String linea="";
	 String cadenaOriginal = "";
	 String[] dias = {"","Primero","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","Once",
	 "Doce", "Trece", "Catorce", "Duince", "Dieciseis", "Diecisiete", "Dieciocho", "Diecinueve", "Veinte", 
	 "Veintiuno", "Veintidos", "veintitres", "Veinticuatro", "Veinticinco", "Veintiseis", "Veintisiete",
	    "Veintiocho", "Veintinueve", "Treinta", "Treintaiuno"};
	 
	 String[] mes = {"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	 
	 // se declara la variable archivo para mandar a llamr el archivo .txt
		File archivo1 = new File("C:\\Users\\angel\\Desktop\\archivofechas.txt");
		try {
			FileReader fr = new FileReader(archivo1);//cache
			BufferedReader br = new BufferedReader(fr);// sirve para leer por linea
		 while ((linea = br.readLine()) !=null){  //// comparacion LINEA ES DIFERENTE DE NUL(LO QUE DECLARE QUE ERA LINEA ES DIF DE NULL)
			cadenaOriginal = cadenaOriginal + linea + ",";
			
			System.out.println(linea); //imprime el primer txt
	 } 
		}catch(Exception e) {// Atrapa (maneja) el error
		e.printStackTrace();//Da los detalles de lo que esta haciendo (te dice donde esta el error)
		}
		String[] fechaNum1 = cadenaOriginal.split(",");  //se declara un string y se iguala a la cadena original para que con split se divida el texto
		int num = 0; //declara una variable de tipo int
		  String fechaletra = " ";  //declara una variable de tipo string 
		  for (int i = 0; i < fechaNum1.length; i++) {  // se inicia el for 
			  
		   for (int j = 0; j < 8; j += 2) {    
			   num = Integer.parseInt((Character.toString(fechaNum1[i].charAt(j))) + (Character.toString(fechaNum1[i].charAt(j + 1))));
		    if (j < 1) {    
		    	fechaletra = fechaletra + dias[num] + " de " ; 
		    } else if (j < 3 && j >= 1) {    
		    	fechaletra = fechaletra + mes[num] + " de " ;
		    } else if (j >= 3) {     
		    	fechaletra = fechaletra + fechaNum1[i].charAt(j) + fechaNum1[i].charAt(j + 1);
		    }  
		  }
		   fechaletra = fechaletra + "\n"; 
		   }
		System.out.println(fechaletra);
		  
		  File archivo2 = new File("C:\\Users\\angel\\Desktop\\fechas.txt");
		  try {   
			  FileWriter wr = new FileWriter(archivo2, false);
			  wr.write(fechaletra);  
			  wr.close();
			  
		  } catch (Exception ex)
		  {
		   ex.printStackTrace();  
		   }
		 }
		}
	
		
	
	

