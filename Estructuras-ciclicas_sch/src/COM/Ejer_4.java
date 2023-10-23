package COM;
import java.util.Scanner;
public class Ejer_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	String cadena = " ";
	char l;
	String caracter = "";
	int contador=0;
	System.out.println("teclea la frase a evaluar");
	cadena = sc.nextLine();
	System.out.println("Teclea la letra que deseas contar");
	l = sc.next().charAt(0);	
	for (int i = 0; i < cadena.length(); i++) {
		if(cadena.charAt(i)==l) {
				contador++;
				}
	}
	if(contador==0) {
		System.out.println("caracter no encontrado");
	}
	System.out.println("la letra se repite: "+contador+" veces");
}
}
