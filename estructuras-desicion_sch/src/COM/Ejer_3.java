package COM;
import java.util.Scanner;
public class Ejer_3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double numero1, numero2;
		System.out.println("Teclee el numerador: ");
		numero1 = entrada.nextDouble();
		System.out.println("Teclee el denominador: ");
		numero2 = entrada.nextInt();
	
		if(numero2 !=0) {
			System.out.println("El Resultado es: "+(numero1/numero2));
		}else {
			System.out.println("Error");
		}
	}

}
