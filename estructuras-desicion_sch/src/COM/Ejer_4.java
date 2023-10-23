package COM;
import java.util.Scanner;
public class Ejer_4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota, edad;
		char sexo;
		System.out.println("Teclee la información solicitada ");
		System.out.println(" ");
		System.out.println("Teclee su Nota: ");
		nota = entrada.nextInt();
		System.out.println("Teclee su Edad: ");
		edad = entrada.nextInt();
		System.out.println("Teclee su Sexo: (M)Masculino o (F)Femenino ");
		sexo = entrada.next().charAt(0);
		
		if(sexo=='M'||sexo=='m') {
			if((nota>=5)&&(edad>=18)) {
			System.out.println("POSIBLE");
			}else{
				System.out.println("NO ACEPTADO");
			}
		}
		if(sexo=='F'||sexo=='f') {
			if((nota>=5)&&(edad>=18)) {
			System.out.println("ACEPTADA");
			}else{
				System.out.println("NO ACEPTADA");
			}
		
		}
}
}