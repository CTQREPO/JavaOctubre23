package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) {
		
	
	/* try {
         // Leer el archivo de entrada
         BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Juan\\Documents\\Documentos para lectura y escritura Ceteq\\entrada.txt"));
         FileWriter fw = new FileWriter("C:\\Users\\Juan\\Documents\\Documentos para lectura y escritura Ceteq\\salida.txt");

         String line;
         int dia;
         int mes;
         int ano;
         
         
         while ((line = br.readLine()) != null) {
             // Extraer los números del archivo
              dia = Integer.parseInt(line.substring(0, 2));
              mes = Integer.parseInt(line.substring(2, 4));
             ano = Integer.parseInt(line.substring(4));

             // Array de nombres de días y meses
             String[] dias = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte", "veintiún"};
             String[] meses = {"", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

             // Validar los números de día y mes
             String diaStr = (dia >= 1 && dia <= 21) ? dias[dia] : "Día no válido";
             String mesStr = (mes >= 1 && mes <= 12) ? meses[mes] : "Mes no válido";

             // Crear una cadena para el año
             String anioStr = String.valueOf(ano);

             // Crear una cadena final
             String resultado = diaStr + " de " + mesStr + " de " + anioStr;

             // Escribir el resultado en el archivo de salida
             fw.write(resultado + "\n");
         }

         br.close();
         fw.close();

         System.out.println("Proceso completado. Los resultados se han escrito en salida.txt.");
     } catch (IOException e) {
         System.err.println("Error al leer o escribir el archivo.");
         e.printStackTrace();
     }*/
		
		
		
		try {
            // Leer el archivo de entrada
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Juan\\Documents\\Documentos para lectura y escritura Ceteq\\entrada.txt"));
            FileWriter fw = new FileWriter("C:\\Users\\Juan\\Documents\\Documentos para lectura y escritura Ceteq\\salida.txt");
            String line;
            int dia;
            int mes;
            int año;
            // Array de nombres de días y meses
            String[] dias = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte", "veintiún"};
            String[] meses = {"", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
            
            
            
            while ((line = br.readLine()) != null) {
                // Extraer los números del archivo
                dia = Integer.parseInt(line.substring(0, 2));
                mes = Integer.parseInt(line.substring(2, 4));
                año = Integer.parseInt(line.substring(4));

               
                

                // Validar los números de día y mes
                String diaStr;

                if (dia >= 1 && dia <= 31) {
                    diaStr = dias[dia];
                } else {
                    diaStr = "Día no válido";
                }

                String mesStr;

                if (mes >= 1 && mes <= 12) {
                    mesStr = meses[mes];
                } else {
                    mesStr = "Mes no válido";
                }

                // Crear una cadena para el año
                String añoStr = String.valueOf(año);

                // Crear una cadena final
                String resultado = diaStr + " de " + mesStr + " de " + añoStr;

                // Escribir el resultado en el archivo de salida
                fw.write(resultado + "\n");
            }

            br.close();
            fw.close();

            System.out.println("Proceso completado. Los resultados se han escrito en salida.txt.");
        } catch (IOException e) {
            System.err.println("Error al leer o escribir el archivo.");
            e.printStackTrace();
        }
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
