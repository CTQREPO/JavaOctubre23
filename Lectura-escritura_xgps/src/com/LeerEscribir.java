package com;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
public class LeerEscribir { 
public static void main(String[] args) {
  String line = "";
  String cadena ="";
  String [] dias = {"","Primero", "Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","Once","Doce","Trece","Catorce","Quince","Dieciseis","Diecisiete","Dieciocho","Diecinueve","veinte","Veintiuno","Veintidos","Veintitres","Veinticuatro","Veinticinco","Veintiseis","Veintisiete","Veintiocho","Veintinueve","Treinta","Treinta y uno"};
  String [] meses = {"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
  File Archivo = new File("C:\\Users\\GABRIELA\\Desktop\\Fechas.txt");
  try {
    FileReader fr = new FileReader(Archivo);
    BufferedReader br = new BufferedReader(fr);
    while((line = br.readLine()) !=null) {
      cadena = cadena+line+",";
    }
  }catch(Exception e){
    e.printStackTrace();
  }
  String[] fechasprimnum = cadena.split(",");
  
      int num=0;
      String fechaletra = "";
      for(int i = 0; i < fechasprimnum.length; i++) {
        for(int j = 0; j < 8; j+=2) {
        num = Integer.parseInt((Character.toString(fechasprimnum[i].charAt(j)))+(Character.toString(fechasprimnum[i].charAt(j+1))));
        if(j<1) {
          fechaletra = fechaletra + dias[num]+" de "; 
        }else if(j<3 && j>=1) {
          fechaletra = fechaletra + meses[num]+" de "; 
        }else if(j>=3) {
          fechaletra = fechaletra + fechasprimnum[i].charAt(j)+fechasprimnum[i].charAt(j+1); 
        }
        }
        fechaletra=fechaletra+"\n";
      }
      System.out.println(fechaletra);
      File Archivo2 = new File("C:\\Users\\GABRIELA\\Desktop\\Escribir.txt");
      try {
        FileWriter wr = new FileWriter(Archivo2, false);
        wr.write(fechaletra);
        wr.close();
      }catch(Exception ex) {
        ex.printStackTrace();
      }
}

}


