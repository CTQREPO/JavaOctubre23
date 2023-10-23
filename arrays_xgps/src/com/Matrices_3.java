package com;

import java.util.Arrays;

public class Matrices_3 {
	public static void main(String[] args) {
		
		String[][] matriz1= { {"4","1","7","1"}, 
			                  {"2","2","9","3"}, 
			                  {"3","7","5","8"}, 
			                  {"1","2","3","0"} };
		
		String[][] matriz2= { {"P","2","3","4"},
				              {"4","3","2","1"},
				              {"3","4","2","6"},
				              {"0","8","4","2"} };
		int[][] mat3= new int [4][4];
		int[][] mat4= new int [4][4];
		int[][] mat5= new int [4][4];
		int[][] mat6= new int [4][4];
		int[][] mat7= new int [4][4];
		String numeros= "1,2,3,4,5,6,7,8,9,0";
		
		for(int i=0;i<matriz1.length;i++){
			
		 for(int j=0;j<matriz2[i].length;j++){
			 if(numeros.indexOf(matriz1[i][j]) >=0 && numeros.indexOf(matriz2[i][j])>=0) {
			
				mat3[i][j] = Integer.parseInt(matriz1[i][j]);
			 mat4[i][j] = Integer.parseInt(matriz2[i][j]);
		 
			 mat5[i][j]= mat5[i][j]+mat3[i][j];
			 mat6[i][j]= mat6[i][j]+mat4[i][j];
			 
		mat7[i][j]= mat5[i][j]+mat6[i][j];
		
		 }	 
		 }
		 } 
	for (int i = 0; i < mat7.length; i++) {
		System.out.println(Arrays.toString(mat7[i]));
		
	}
	}
	
}
	


	


