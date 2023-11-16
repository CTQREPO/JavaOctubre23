package com;
import java.util.Scanner;
public class Ejercicio7 {
	  public static void main(String[] args) {
		    double dinero=700;
		    int mes=1;
		    
		    
		    for(double i=dinero; i<=1500;i++) {
		      if(dinero<1500) {
		      dinero = dinero*1.02;
		      mes++;}else {break; }
		    } System.out.println("Tendra que ahorrar "+mes+" meses");
		    
		}
		}