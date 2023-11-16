package COM;
import java.util.Scanner;
public class Ejer_8 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int dia;
		
		System.out.println("Teclee el dia de la semana ");
		dia = entrada.nextInt();
	
	switch(dia) {
	case 1:
		System.out.println("LUNES");
		break;
	case 2:
		System.out.println("MARTES");
		break;
	case 3:
		System.out.println("MIERCOLES");
		break;
	case 4:
		System.out.println("JUEVES");
		break;
	case 5:
		System.out.println("VIERNES");
		break;
	case 6:
		System.out.println("SABADO");
		break;
	case 7:
		System.out.println("DOMINGO");
		break;
	}
	if(dia>=8) {
		System.out.println("ERROR");}
	}

}
