package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class ejercicio_lectura_escritura {
public static void main(String[] args) {

	//lectura
	
	String linea="";
	String cadena ="";
	String[] dias = {"","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","once","doce","trece","catorce","quince","dieciseis","diecisiete","diesciocho","diecinueve",
						"veinte","veintiuno","veintidos","veintitres","veinticuatro","veinticinco","veintiseis","veintisiete","veintiocho","veintinueve","treinta","treintaiuno"};
	String[] meses = {"","enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre",};
	String fecha = "";
	File archivolectura = new File("C:\\Users\\carlo\\Desktop\\ejercicio lectura escritura\\leer.txt"); //ubicacion del archivo lectura
	File archivoescritura = new File("C:\\Users\\carlo\\Desktop\\ejercicio lectura escritura\\escribir.txt"); //ubicacion del archivo escritura
	
	try {
		
		FileReader fr = new FileReader(archivolectura);					 //cache
		BufferedReader br = new BufferedReader (fr); 				//sirve para leer por lineas
		
		while((linea=br.readLine()) !=null) { 
			//System.out.println(linea); //imprime todo el texto en saltos de linea
			
			cadena = cadena + linea + ",";	//imprime todo el texto en una sola linea
			
		}
		//System.out.println(cadena);
		String[] valor1 = cadena.split(",");
	
		for (int i = 0; i < valor1.length; i++) {
			fecha = fecha + dias[Integer.parseInt(valor1[i].substring(0,2))]+" de "+(meses[Integer.parseInt(valor1[i].substring(2,4))]+" del "+(valor1[i].substring(4,8))+ "\n");

		}		
		
		System.out.println(fecha);		
		
		//TRUE mantiene el texto y agrega // FALSE borra el texto anterior y agrega
		FileWriter wr = new FileWriter(archivoescritura,false);
		wr.write(fecha);
		wr.close();
		
	}catch(Exception ex) {		//maneja el error	
	ex.printStackTrace(); 		//detalla el error	

	}
		
	
	
}
}