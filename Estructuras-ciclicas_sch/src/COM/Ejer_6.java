package COM;

public class Ejer_6 {
	public static void main(String[] args) {
		double dinero=1000;
		double interes=0;
		for (int i = 0; i < 12; i++) {
			dinero = dinero*1.02;
		}
		System.out.println("El dinero generado en un año es:"+dinero);
	}
}
