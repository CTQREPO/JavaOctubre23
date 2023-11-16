package COM;

import java.util.Scanner;

public class Ejer_13 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int horas;
	int extra;
	System.out.println("teclee los dias trabajados");
	horas = entrada.nextInt();
	 
	if(horas<=40) {
		System.out.println("Su salario semanal es de: "+horas*16);
		
	}else if(horas>40){
		extra = horas - 40;
		System.out.println("Su salario semanal es de: "+((40*16)+(extra*20)));
	}
}
}
