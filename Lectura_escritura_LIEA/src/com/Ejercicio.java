package com;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		
		String fecha = " ";
		char [] newfecha= new char[8];
		char [] dia= new char [2];
		char [] mes = new char [2];
		char [] año = new char [4];
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("transformar fechas a palabras DDMMAAAA");
		
		fecha=entrada.nextLine();
		
		newfecha=fecha.toCharArray(); //TRANSFORMA UN STRING A ARRAY DE CARACTERES
				
//		System.out.println(newfecha);// CADENA DE ARRAYS
		
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
		
		
//		System.out.println(dia);
//		System.out.println(mes);
				

//		if(Arrays.equals(dia, mes)) {
//			System.out.println("xxx");
//		}else {System.out.println("no");}
//		
		switch(day) {
		case "01":
			System.out.println("UNO");
			break;
		case "02":
			System.out.println("DOS");
			break;
		case "03":
			System.out.println("TRES");
			break;
		case "04":
			System.out.println("CUATRO");
			break;
		case "05":
			System.out.println("CINCO");
			break;
		case "06":
			System.out.println("SEIS");
			break;
		case "07":
			System.out.println("SIETE");
			break;
		case "08":
			System.out.println("OCHO");
			break;
		case "09":
			System.out.println("NUEVE");
			break;
		case "10":
			System.out.println("DIEZ");
			break;
		case "11":
			System.out.println("ONCE");
			break;
		case "12":
			System.out.println("DOCE");
			break;
		case "13":
			System.out.println("TRECE");
			break;
		case "14":
			System.out.println("CATORCE");
			break;
		case "15":
			System.out.println("QUINCE");
			break;
		case "16":
			System.out.println("DIECISEIS");
			break;
		case "17":
			System.out.println("DIECISIETE");
			break;
		case "18":
			System.out.println("DIECIOCHO");
			break;
		case "19":
			System.out.println("DIECINUEVE");
			break;
		case "20":
			System.out.println("VEINTE");
			break;
		case "21":
			System.out.println("VEINTIUNO");
			break;
		case "22":
			System.out.println("VEINTIDOS");
			break;
		case "23":
			System.out.println("VEINTITRES");
			break;
		case "24":
			System.out.println("VEINTICUATRO");
			break;
		case "25":
			System.out.println("VEINTICINCO");
			break;
		case "26":
			System.out.println("VEINTISEIS");
			break;
		case "27":
			System.out.println("VEINTISIETE");
			break;
		case "28":
			System.out.println("VEINTIOCHO");
			break;
		case "29":
			System.out.println("VIENTINUEVE");
			break;
		case "30":
			System.out.println("TREINTA");
			break;
		case "31":
			System.out.println("TREINTA Y UNO");
			break;
			default:System.out.println("DIA INVALIDO");
			
		}
		
		
		
		
		switch(mounth) {
		case "01":
			System.out.println("ENERO");
			break;
		case "02":
			System.out.println("FEBRERO");
			break;
		case "03":
			System.out.println("MARZO");
			break;
		case "04":
			System.out.println("ABRIL");
			break;
		case "05":
			System.out.println("MAYO");
			break;
		case "06":
			System.out.println("JUNIO");
			break;
		case "07":
			System.out.println("JULIO");
			break;
		case "08":
			System.out.println("AGOSTO");
			break;
		case "09":
			System.out.println("SEPTIEMBRE");
			break;
		case "10":
			System.out.println("OCTUBRE");
			break;
		case "11":
			System.out.println("NOVIEMBRE");
			break;
		case "12":
			System.out.println("DICIEMBRE");
			break;
		default: System.out.println("MES INVALIDO");
		}

		System.out.println(año);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
