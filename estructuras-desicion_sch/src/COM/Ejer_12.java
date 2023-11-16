package COM;
import java.util.Scanner;
public class Ejer_12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double d, s, n, b;
		System.out.println("teclea el monto a donar");
		d = entrada.nextDouble();
		if (d >= 10000) {
			s = d * .30;
			n = d * .50;
			b = d * .20;
			System.out.println("El monto destinado al centro de salud es de:" + s);
			System.out.println("El monto destinado al comedor de niños es de:" + n);
			System.out.println("El monto destinado a inversion en la bolsa es de:" + b);
		} else {
			s = d * .25;
			n = d * .60;
			b = d * .15;
			System.out.println("El monto destinado al centro de salud es de:" + s);
			System.out.println("El monto destinado al comedor de niños es de:" + n);
			System.out.println("El monto destinado a inversion en la bolsa es de:" + b);
		}

	}
}
