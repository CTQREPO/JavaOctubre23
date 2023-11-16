package COM;
import java.util.Scanner;
public class Ejer_1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Digite el primer numero a comparar: ");
		numero1 = entrada.nextInt();
		System.out.println("Digite el segundo numero a comparar: ");
		numero2 = entrada.nextInt();
	
		if(numero1<numero2) {
			System.out.println("El segundo numero es mayor");
		}else if(numero1>numero2) {
			System.out.println("El primer numero es mayor");
		}else if(numero1==numero2) {
			System.out.println("Los numeros son iguales");
		}
	
	}
}
