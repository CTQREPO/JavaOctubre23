package COM;
import java.util.Scanner;
public class Ejer_7 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int dado;
		String u="UNO", d="DOS", t="TRES", c="CUATRO", ci="CINCO", s="SEIS";
		
		System.out.println("Teclee el resultado del dado ");
		dado = entrada.nextInt();
	
	switch(dado) {
	case 1:
		System.out.println("La cara opuesta es:"+s);
		break;
	case 2:
		System.out.println("La cara opuesta es:"+ci);
		break;
	case 3:
		System.out.println("La cara opuesta es:"+c);
		break;
	case 4:
		System.out.println("La cara opuesta es:"+t);
		break;
	case 5:
		System.out.println("La cara opuesta es:"+d);
		break;
	case 6:
		System.out.println("La cara opuesta es:"+u);
		break;
	}
	if(dado>=7) {
		System.out.println("ERROR: número incorrecto");}
	}
}
