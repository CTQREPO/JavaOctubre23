package COM;

import java.util.Scanner;

public class Ejer_12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int edades = 0;
		double suma = 0;
		double contador = 0;
		double promedio = 0;
		while (promedio <= 25) {
			System.out.println("teclee las edades a calcular");
			edades = s.nextInt();
			suma = suma + edades;
			contador = contador + 1;
			promedio = suma / contador;
			if (promedio > 25) {
				break;
			}
		}
		System.out.println("El promedio de edades es: " + promedio +" ");
	}
}
