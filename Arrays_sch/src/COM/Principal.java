package COM;

import java.util.Date;
import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
		
		//inicializa un array de 10 posiciones
		int[] numeros = new int [10];
		int[] valores = {1,2,3,4,5,6,7,8,9,0};
		String[] objetos = new String[10];
		
		numeros[0]=12233;
		numeros[1]=123;
		numeros[2]=1;
		numeros[3]=12233;
		numeros[4]=123;
		numeros[5]=1;
		numeros[6]=12233;
		numeros[7]=123;
		numeros[8]=1;
		numeros[9]=12233;
		for(int i = 0; i<numeros.length; i++) {
			//System.out.println(numeros[i]+200);
			numeros [i]=0;
		}
		
		
		
		
		
		
		
		
		
		
		//ver el valor de una posicion especifica del array
		System.out.println(numeros[0]);
		
		System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(valores));
		System.out.println(valores.length);//ver el tamaño del array
		
		
		//array que le cabe cualquier cosa 
		Object[] detodo = new Object[10];
		detodo[0]= "hola";
		detodo[1]= false;
		detodo[2]= 12325326624L;
		detodo[3]= 3.1416;
		detodo[4]= 'k';
		detodo[5]= new Long("183804217921");
		detodo[6]= new Date();
		
		System.out.println(Arrays.toString(detodo));
		System.out.println(Arrays.toString(objetos));
		
		
		
	}

}
