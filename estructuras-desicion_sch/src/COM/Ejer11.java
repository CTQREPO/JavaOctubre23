package COM;
import java.util.Scanner;
public class Ejer11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double p,a,imc;
		
		System.out.println("Teclee el peso a calcular");
		p = entrada.nextDouble();
		System.out.println("Teclee la altura a calcular");
		a = entrada.nextDouble();
		imc=p/(a*2);
		if(imc<16) {
			System.out.println("Diagnostico: Criterio de ingreso en hospital");
		}else if(imc>=16&&imc<=17) {
			System.out.println("Diagnostico: Infrapeso");
		}else if(imc>=17.1&&imc<=18){
			System.out.println("Diagnostico: Bajo peso");
		}else if(imc>=18.1&&imc<=25) {
			System.out.println("Diagnostico: Peso normal (saludable)");
		}else if(imc>=25.1&&imc<=30) {
			System.out.println("Diagnostico: Sobrepeso (obesidad grado I)");
		}else if(imc>=30.1&&imc<=35) {
			System.out.println("Diagnostico: Sobrepeso cronico (obesidad grado II)");
		}else if(imc>=35.1&&imc<=40) {
			System.out.println("Diagnostico: Obesidad premorbida (obesidad grado III)");
		}else if(imc>=40.1) {
			System.out.println("Diagnostico: Obesidad morbida (obesidad grado IV)");
		}
	}

}
