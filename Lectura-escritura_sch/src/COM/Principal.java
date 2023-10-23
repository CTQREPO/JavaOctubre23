package COM;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {
	public static void main(String[] args) {
		
		
		String linea="";
		
		File archivo = new File("C:\\Users\\CHINO GUAMAS\\Desktop\\nota de prueba.txt");
		
		
		try {//intenta
			FileWriter wr = new FileWriter(archivo, true);//true conserva lo que ya estaba en el archivo, false borra todo lo que estaba y escribe 
			wr.write("ESTO ES NUEVO DENTRO DEL ARCHIVO \n");
			 
			
			
			
			
			
			
//			FileReader fr = new FileReader(archivo);//cache
//			BufferedReader br = new BufferedReader(fr);//sirve para leer por ineas
//			
//			//mientras las lineas sean diferentes de null
//			while( (linea =br.readLine()) !=null) {
//				System.out.println(linea);
//			}
			
			wr.close();
		}catch(Exception ex) {//Atrapa (maneja) el error
			ex.printStackTrace();//identifica el error
		}
		
	}

}

