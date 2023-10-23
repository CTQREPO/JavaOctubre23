package COM;
import java.util.Scanner;
public class Ejer_2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double numero;
		System.out.println("Digite el primer numero a comparar: ");
		numero = entrada.nextDouble();
		
	
		if(numero %2==0 ) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
	}

}
