package com;

import java.util.Arrays;

public class Matrices {

	public static void main(String[] args) {

		 String [][] matrix_1 = new String [6][5];
		 
		 String [][] matrix_2 = {{"a","b","c"},{"d","e","800"},{"=","p","x"}};
		 //System.out.println(Arrays.deepToString(matrix_1));
		
		 
		 for (int i = 0; i < matrix_2.length; i ++) {
			System.out.print("[");
			for (int j = 0; j < matrix_2[i].length; j++) {
				System.out.print(matrix_2[i][j]+" ");
			}
			System.out.println("]");
		}
	}

}
