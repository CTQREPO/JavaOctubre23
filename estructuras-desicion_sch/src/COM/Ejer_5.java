package COM;
import java.util.Scanner;
public class Ejer_5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double uva, tamaño;
		char tipo;
		System.out.println("Teclee el precio de la Uva ");
		uva = entrada.nextInt();
		System.out.println("Teclee el tipo A o B ");
		tipo = entrada.next().charAt(0); 
		System.out.println("Teclee el tamaño 1 o 2 ");
		tamaño = entrada.nextInt(); 
		
		if(tipo=='A'||tipo=='a') {
			if(tamaño==1) {
			System.out.println("El precio final es de:"+(uva+20));
			}else{
				System.out.println("El precio final es de:"+(uva+30));
			}
		}
		if(tipo=='B'||tipo=='b') {
			if(tamaño==1) {
			System.out.println("El precio final es de:"+(uva-30));
			}else{
				System.out.println("El precio final es de:"+(uva-50));
				}
		
		}
}

}
   