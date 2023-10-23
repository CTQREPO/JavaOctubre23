package COM;

import java.util.Scanner;

public class Ejer_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;

		System.out.println("Ingresa el numero a multiplicar ");
		num1 = sc.nextInt();
		System.out.println("Iteracion deseada ");
		num2 = sc.nextInt();

		for (int K = 1; K < num2+1; K++) {

			System.out.println(num1 + "*" + K + "=" + (num1 * K));

		}
	}
}
