package suma;

import java.util.Scanner;

public class Suma {

	public Suma() {
		
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String numeros = "1234567890";

		// Matriz A
		String[][] mA = { { "a", "b", "4" }, 
				          { "7", "j", "5" },
				          { "4", "8", "x" } };
		String[][] mB = new String[3][3];

		
		for (int i = 0; i < mA.length; i++) { // filas
			for (int j = 0; j < mA.length; j++) { // columnas
				System.out.println("ingresa unvalor, posicion: " + i + "," + j);
				mA[i][j] = sc.nextLine();
				
			}

		}

		for (int i = 0; i < mB.length; i++) { // filas
			for (int j = 0; j < mB.length; j++) { // columnas
				System.out.println("ingresa unvalor, posicion: " + i + "," + j);
				mB[i][j] = sc.nextLine();

				if (numeros.indexOf(mA[i][j]) >= 0 && numeros.indexOf(mA[i][j]) >= 0) {
					// suma de matrices
					int n1 = Integer.parseInt(mA[i][j]);
					int n2 = Integer.parseInt(mB[i][j]);
				
			
					
					

		              //segunda forma -try&catch()	siemre completa la estructura 	
//				try {
//					int n1 = Integer.parseInt(mA[i][j]);
//					int n2 = Integer.parseInt(mB[i][j]);
//				}catch(Exception ex) {  //si no puedes atrapa el error 
//					mC [i][j] = 0; //relleno con 0
//				}
					
					
					
					
					
			}

		}

		

		

		}



		
	
		
		
		//
	}

}
