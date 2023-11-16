package COM;
import java.util.Scanner;
public class Ejer_9 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int mes;
		
		System.out.println("Teclee el numero del mes deseado ");
		mes = entrada.nextInt();
	
	switch(mes) {
	case 1:
		System.out.println("El mes de Enero tiene 31 dias");
		break;
	case 2:
		System.out.println("El mes de Febrero tiene 28 dias");
		break;
	case 3:
		System.out.println("El mes de Marzo tiene 31 dias");
		break;
	case 4:
		System.out.println("El mes de Abril tiene 30 dias");
		break;
	case 5:
		System.out.println("El mes de Mayo tiene 31 dias");
		break;
	case 6:
		System.out.println("El mes de Junio tiene 30 dias");
		break;
	case 7:
		System.out.println("El mes de Julio tiene 31 dias");
		break;
	case 8:
		System.out.println("El mes de Agosto tiene 31 dias");
		break;
	case 9:
		System.out.println("El mes de Septiembre tiene 30 dias");
		break;
	case 10:
		System.out.println("El mes de Octubre tiene 31 dias");
		break;
	case 11:
		System.out.println("El mes de Noviembre tiene 30 dias");
		break;
	case 12:
		System.out.println("El mes de Diciembre tiene 31 dias");
		break;
	}
	if(mes>=13) {
		System.out.println("ERROR");}
	}

}
