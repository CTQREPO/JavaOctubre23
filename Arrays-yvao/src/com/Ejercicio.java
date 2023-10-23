package com;

import java.util.Arrays;

public class Ejercicio {

	public static void main(String[] args) {
		
		String[][] matriz1 ={ {"1", "5", "8","k"},
							{"2", "1", "d","7"},
							{"3", "b", "2","5"}, 
							{"a","8", "5","8"}};
		
		String[][] matriz2={ {"7", "8", "y","1"},
							 {"5", "4" ,"1","p"},
							 {"5", "h", "6","1"}, 
							 {"ñ", "1", "4","7"}};
		
		int[][] matriz3 = new int[4][4];
	
		 int num1 [][]=new int [4][4];
		 int num2 [][]=new int [4][4];
		 int cont1 [][]=new int [4][4];
		 int cont2 [][]=new int [4][4];
		String numero="1234567890";	 
		 
		 
		 
		for(int i = 0; i<matriz1.length; i++ ) {
			for (int j=0; j<matriz2.length; j++) {
				
				if(numero.indexOf(matriz1[i][j])>=0 && numero.indexOf(matriz2[i][j])>=0) {
					
				 
				num1[i][j]=Integer.parseInt(matriz1[i][j]);
				num2[i][j]=Integer.parseInt(matriz2[i][j]);
				
				matriz3[i][j] = num1[i][j] + num2[i][j];
				

				
				}
				
				
			}
			
				
		}
			
			for(int i = 0; i < matriz3.length; i++){
				System.out.println(Arrays.toString(matriz3[i]));
		}
		}
	}


	

