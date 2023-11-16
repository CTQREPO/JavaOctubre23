package COM;
import java.util.Scanner;
public class Ejer_9 {
	
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int a; 
    int b;
    System.out.println("Introduzca el primer numero");
    a = scanner.nextInt();
    System.out.println("Introduzca el segundo numero");
    b = scanner.nextInt();
     if(a>=b) {
       
      for (int i = b+1; i <a; i++) {
        if(i %2 == 0) {
          
        
      System.out.println("numero "+i);
      }
     }
     }else{
       for (int i = a+1; i <b; i++) {
         if(i %2 == 0) {
       System.out.println("numero "+i);
       }
     }
     }
}
}
