package com;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ejemplo {

	public static void main(String[] args) {
		
		//String fecha = bufferedReader.readLine();
		char [] newfecha= new char[8];
		char [] dia= new char [2];
		char [] mes = new char [2];
		char [] año = new char [4];
		
		// Ruta del archivo de entrada y salida
        String archivoEntrada = "C:\\Users\\IVAN\\Desktop\\fechas.txt";
        String archivoSalida = "C:\\Users\\IVAN\\Desktop\\fechas2.txt";
        
        System.out.println("transformar fechas a palabras DDMMAAAA");

        try (FileReader fileReader = new FileReader(archivoEntrada);/// LEE EL ARCHIVO
             BufferedReader bufferedReader = new BufferedReader(fileReader);///// LEE LAS INEAS DENTRO DEL ARCHIVO
             FileWriter fileWriter = new FileWriter(archivoSalida);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) 
        {
        	String fecha = bufferedReader.readLine();
 
        	while((fecha = bufferedReader.readLine()) !=null) {/// VA A LEER TODAS LA LINEAS DEL ARCHIVO TXT
    		newfecha=fecha.toCharArray(); //TRANSFORMA UN STRING A ARRAY DE CARACTERES

        	for (int i = 0; i < 2; i++) {
    			dia[i]=newfecha[i];	
    		}
    		
    		mes[0]=newfecha[2];
    		mes[1]=newfecha[3];
    		
    		año[0]=newfecha[4];
    		año[1]=newfecha[5];
    		año[2]=newfecha[6];
    		año[3]=newfecha[7];
    		
    		String day = new String(dia);
    		String mounth = new String(mes);
    		String year = new String(año);

    		switch(day) {
    		case "01":
    			System.out.println("UNO");
    			bufferedWriter.write("UNO");
    			break;
    		case "02":
    			System.out.println("DOS");
    			bufferedWriter.write("DOS");
    			break;
    		case "03":
    			System.out.println("TRES");
    			bufferedWriter.write("TRES");
    			break;
    		case "04":
    			System.out.println("CUATRO");
    			bufferedWriter.write("CUATRO");
    			break;
    		case "05":
    			System.out.println("CINCO");
    			bufferedWriter.write("CINCO");
    			break;
    		case "06":
    			System.out.println("SEIS");
    			bufferedWriter.write("SEIS");
    			break;
    		case "07":
    			System.out.println("SIETE");
    			bufferedWriter.write("SIETE");
    			break;
    		case "08":
    			System.out.println("OCHO");
    			bufferedWriter.write("OCHO");
    			break;
    		case "09":
    			System.out.println("NUEVE");
    			bufferedWriter.write("NUEVE");
    			break;
    		case "10":
    			System.out.println("DIEZ");
    			bufferedWriter.write("DIEZ");
    			break;
    		case "11":
    			System.out.println("ONCE");
    			bufferedWriter.write("ONCE");
    			break;
    		case "12":
    			System.out.println("DOCE");
    			bufferedWriter.write("DOCE");
    			break;
    		case "13":
    			System.out.println("TRECE");
    			bufferedWriter.write("TRECE");
    			break;
    		case "14":
    			System.out.println("CATORCE");
    			bufferedWriter.write("CATORCE");
    			break;
    		case "15":
    			System.out.println("QUINCE");
    			bufferedWriter.write("QUINCE");
    			break;
    		case "16":
    			System.out.println("DIECISEIS");
    			bufferedWriter.write("DIECISEIS");
    			break;
    		case "17":
    			System.out.println("DIECISIETE");
    			bufferedWriter.write("DIECISIETE");
    			break;
    		case "18":
    			System.out.println("DIECIOCHO");
    			bufferedWriter.write("DIECIOCHO");
    			break;
    		case "19":
    			System.out.println("DIECINUEVE");
    			bufferedWriter.write("DIECINUEVE");
    			break;
    		case "20":
    			System.out.println("VEINTE");
    			bufferedWriter.write("VEINTE");
    			break;
    		case "21":
    			System.out.println("VEINTIUNO");
    			bufferedWriter.write("VEINTIUNO");
    			break;
    		case "22":
    			System.out.println("VEINTIDOS");
    			bufferedWriter.write("VEINTIDOS");
    			break;
    		case "23":
    			System.out.println("VEINTITRES");
    			bufferedWriter.write("VEINTITRES");
    			break;
    		case "24":
    			System.out.println("VEINTICUATRO");
    			bufferedWriter.write("VEINTICUETRO");
    			break;
    		case "25":
    			System.out.println("VEINTICINCO");
    			bufferedWriter.write("VEINTICINCO");
    			break;
    		case "26":
    			System.out.println("VEINTISEIS");
    			bufferedWriter.write("VEINTISEIS");
    			break;
    		case "27":
    			System.out.println("VEINTISIETE");
    			bufferedWriter.write("VEINTISIETE");
    			break;
    		case "28":
    			System.out.println("VEINTIOCHO");
    			bufferedWriter.write("VEINTIOCHO");
    			break;
    		case "29":
    			System.out.println("VIENTINUEVE");
    			bufferedWriter.write("VEINTINUEVE");
    			break;
    		case "30":
    			System.out.println("TREINTA");
    			bufferedWriter.write("TREINTA");
    			break;
    		case "31":
    			System.out.println("TREINTA Y UNO");
    			bufferedWriter.write("TREINTA Y UNO");
    			break;
    			default:System.out.println("DIA INVALIDO");
    			
    		}
    		
    		switch(mounth) {
    		case "01":
    			System.out.println("ENERO");
    			bufferedWriter.write("ENERO");
    			break;
    		case "02":
    			System.out.println("FEBRERO");
    			bufferedWriter.write("FEBRERO");
    			break;
    		case "03":
    			System.out.println("MARZO");
    			bufferedWriter.write("MARZO");
    			break;
    		case "04":
    			System.out.println("ABRIL");
    			bufferedWriter.write("ABRIL");
    			break;
    		case "05":
    			System.out.println("MAYO");
    			bufferedWriter.write("MAYO");
    			break;
    		case "06":
    			System.out.println("JUNIO");
    			bufferedWriter.write("JUNIO");
    			break;
    		case "07":
    			System.out.println("JULIO");
    			bufferedWriter.write("JULIO");
    			break;
    		case "08":
    			System.out.println("AGOSTO");
    			bufferedWriter.write("AGOSTO");
    			break;
    		case "09":
    			System.out.println("SEPTIEMBRE");
    			bufferedWriter.write("SEPTIEMBRE");
    			break;
    		case "10":
    			System.out.println("OCTUBRE");
    			bufferedWriter.write("OCTUBRE");
    			break;
    		case "11":
    			System.out.println("NOVIEMBRE");
    			bufferedWriter.write("NOVIEMBRE");
    			break;
    		case "12":
    			System.out.println("DICIEMBRE");
    			bufferedWriter.write("DICIEMBRE");
    			break;
    		default: System.out.println("MES INVALIDO");
    		}

    		System.out.println(año);
    		bufferedWriter.write(año);
    		System.out.println();
        	}        	
        	
        } catch (IOException e) {
            System.err.println("Error al leer o escribir el archivo: " + e.getMessage());
        }// TODO Auto-generated method stub

	}

}
