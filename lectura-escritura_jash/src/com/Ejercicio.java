package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Ejercicio {
	public static void main(String[] args) {
		String linea = "";
		String cadena = "";
		String fechaLetra = "";
		String fechaCompleta;
		String[] dia = { "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once",
				"doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte",
				"veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco", "veintiséis", "veintisiete",
				"veintiocho", "veintinueve", "treinta", "treinta y uno" };
		String[] mes = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };

		File archivoEntrada = new File("C:\\Users\\Kalex\\Documents\\CETEQ\\Pruebas en java\\Fechas.txt");
		File archivoSalida = new File("C:\\Users\\Kalex\\Documents\\CETEQ\\Pruebas en java\\Fechas en letra.txt");

		try {// Intenta
			FileReader fr = new FileReader(archivoEntrada);// cache
			BufferedReader br = new BufferedReader(fr);// sirve para leer por lineas
			// Mientras las lineas sean diferentes de null junta las lineas extraidas del
			// txt en una variable llamada cadena separado por un ","
			while ((linea = br.readLine()) != null) {
				cadena = cadena + linea + ",";
			}
//			System.out.println(cadena);
			// Divide la cadena del documento que tienen una "," y las separa en una nueva
			// matriz
			String[] fecha = cadena.split(",");
//		System.out.println(Arrays.deepToString(fecha));
			// ciclo que me permite extraer la ubicacion de las fechas e imprimir su valor
			// en letras, de acuerdo
			// a su ubicacion de rango
			for (int i = 0; i < fecha.length; i++) {
				String diaN = dia[Integer.parseInt(fecha[i].substring(0, 2)) - 1];
				String mesN = mes[Integer.parseInt(fecha[i].substring(2, 4)) - 1];
				String añoN = fecha[i].substring(4, 8);
				fechaCompleta = diaN + " de " + mesN + " de " + añoN;
				fechaLetra = fechaLetra + fechaCompleta + "\n";
//				System.out.println("fecha: "+fecha[i].substring(0,2));
//				System.out.println("mes  : "+fecha[i].substring(2,4));
//				System.out.println("año  : "+fecha[i].substring(4,8));
			}
//			System.out.println(fechaLetra);
			FileWriter wr = new FileWriter(archivoSalida, false);
			wr.write(fechaLetra);
			wr.close();
		} catch (Exception e) {// Atrapa (Maneja) el error
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
