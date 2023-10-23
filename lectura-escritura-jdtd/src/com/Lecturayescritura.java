package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Lecturayescritura {
	
	public static void main(String[] args) {

		String linea = "";
		String cadenaOriginal = "";
		String[] dias = { "", "Primero", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once",
				"doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve", "veinte",
				"veintiuno", "veintidos", "veintitres", "veinticuatro", "veinticinco", "veintiseis", "veintisiete",
				"veintiocho", "veintinueve", "treinta", "treintaiuno" };
		String[] meses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio","julio", "Agosto", "Septiembre", "Octubre",
				"Noviembre", "Diciembre" };
		File archivo = new File("C:\\Users\\elect\\OneDrive\\Documentos\\lecturafechas.txt");
		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);

			while ((linea = br.readLine()) != null) {

				cadenaOriginal = cadenaOriginal + linea + ",";
				System.out.println(linea);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		String[] fechasNum1 = cadenaOriginal.split(",");
		int num = 0;
		String fechaletra =" ";
		for (int i = 0; i < fechasNum1.length; i++) {
			
			for (int j = 0; j < 8; j += 2){
				num = Integer.parseInt((Character.toString(fechasNum1[i].charAt(j))) + (Character.toString(fechasNum1[i].charAt(j + 1))));
				if (j < 1) {
					fechaletra = fechaletra + dias[num] + " de " ; 
				} else if (j < 3 && j >= 1) {
					fechaletra = fechaletra + meses[num] + " de " ;
				} else if (j >= 3) {
					fechaletra = fechaletra + fechasNum1[i].charAt(j) + fechasNum1[i].charAt(j + 1);
				}
			}
			fechaletra = fechaletra + "\n";
		}
		System.out.println(fechaletra);

		File archivo2 = new File("C:\\Users\\elect\\OneDrive\\Documentos\\escriturafecha.txt");
		try {
			FileWriter wr = new FileWriter(archivo2, false);
			wr.write(fechaletra);
			wr.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
