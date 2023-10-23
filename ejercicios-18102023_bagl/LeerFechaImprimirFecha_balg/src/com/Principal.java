package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		String line = "";
		String cadenaOriginal = "";
		String[] dias = { "", "Primero", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez","Once", "Doce", "Trece", "Catorce", "Quince", "Dieciseis", "Diecisiete", "Dieciocho", "Diecinueve","Veinte", "Veintiuno", "Veintidos", "Veintitres", "Veinticuatro", "Veinticinco", "Veintiseis","Veintisiete", "Veintiocho", "Veintinueve", "Treinta", "Treinta y uno" };
		String[] meses = { "", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre","octubre", "noviembre", "diciembre" };
		File archivo = new File("C:\\Users\\abrng\\Documents\\workspace-sts-3.9.13.RELEASE\\Archivos de texto de ejercicios\\LeerFechaNumeros.txt");
		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);

			while ((line = br.readLine()) != null) {

				cadenaOriginal = cadenaOriginal + line + ",";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		String[] fechasNum1 = cadenaOriginal.split(",");

		int num = 0;
		String fechaLetra = "";
		for (int i = 0; i < fechasNum1.length; i++) {
			for (int j = 0; j < 8; j += 2) {
				num = Integer.parseInt((Character.toString(fechasNum1[i].charAt(j))) + (Character.toString(fechasNum1[i].charAt(j + 1))));

				if (j < 1) {
					fechaLetra = fechaLetra + dias[num] + " de ";
				}else if (j < 3 && j >= 1) {
					fechaLetra = fechaLetra + meses[num] + " de ";
				}else if (j >= 3) {
					fechaLetra = fechaLetra + fechasNum1[i].charAt(j) + fechasNum1[i].charAt(j + 1);
				}
			}
			fechaLetra = fechaLetra + "\n";
		}
		System.out.print(fechaLetra);

		File archivo1 = new File("C:\\\\Users\\\\abrng\\\\Documents\\\\workspace-sts-3.9.13.RELEASE\\\\Archivos de texto de ejercicios\\\\EscribirFechaLetra.txt");
		try {
			FileWriter wr = new FileWriter(archivo1, false);
			wr.write(fechaLetra);
			wr.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
