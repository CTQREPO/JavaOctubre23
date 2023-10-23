package COM;

import java.util.Scanner;

public class Ejer_10 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double maleta;
		int c;

		System.out.println("Teclee su destino");
		System.out.println("1) America del Norte ");
		System.out.println("2) America Central ");
		System.out.println("3) America del Sur ");
		System.out.println("4) Europa ");
		System.out.println("5) Asia ");
		c = entrada.nextInt();
		if (c <= 5 && c >= 1) {
			System.out.println("Teclee el peso de su maleta ");
			maleta = entrada.nextDouble();

			if (maleta <= 5 && maleta >= 0) {
				switch (c) {
				case 1:
					System.out.println("El Precio por la entrega de su paquete es de: ");
					System.out.println("$" + (maleta * 24));
					break;
				case 2:
					System.out.println("El Precio por la entrega de su paquete es de: ");
					System.out.println("$" + (maleta * 20));
					break;
				case 3:
					System.out.println("El Precio por la entrega de su paquete es de: ");
					System.out.println("$" + (maleta * 21));
					break;
				case 4:
					System.out.println("El Precio por la entrega de su paquete es de: ");
					System.out.println("$" + (maleta * 10));
					break;
				case 5:
					System.out.println("El Precio por la entrega de su paquete es de: ");
					System.out.println("$" + (maleta * 18));
					break;

				}
			}
			if (maleta > 5) {
				System.out.println("Rechazado, exceso de peso");
			}
		} else {
			System.out.println("opcion no valida");
		}
	}

}
