package com.live;

public class Smartwatch extends Reloj {
	
	String so;
	String sensor;
	
	Pantalla p1; //OBJETO DE LA CLASE PANTALLA
	
	//Procesador
	
	
	public Smartwatch () {
		/// HERADA LOS ATRIBUTOS DE LA CLASE RELOJ "public class Reloj"
	
		
	}

	

	public Smartwatch(String color, String tipo, String material, String tamaño, String forma, String mecanismo,
			double precio, String so, String sensor, Pantalla p1) {
		super(color, tipo, material, tamaño, forma, mecanismo, precio);
		this.so = so;
		this.sensor = sensor;
		this.p1 = p1;
	}



	public Smartwatch(String so, String sensor) {
		
		super(); //CONSTRUCTOR DE CLASE PADRE
		this.so = so;
		this.sensor = sensor;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public String getSensor() {
		return sensor;
	}

	public void setSensor(String sensor) {
		this.sensor = sensor;
	}

	
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///Comportamientos
	//1-Metodos nativos
	
	@Override
	public String toString() {
		return "Smartwatch [so=" + so + ", sensor=" + sensor + ", p1=" + p1 + ", color=" + color + ", tipo=" + tipo
				+ ", material=" + material + ", tamaño=" + tamaño + ", forma=" + forma + ", mecanismo=" + mecanismo
				+ ", precio=" + precio + "]";
	}



	public void  cronometro(int min,int seg) {
		
		for (int i = 0; i < min; i++) {
			for (int j = 0; j < seg; j++) {
				System.out.println("["+i+":"+j+"]");
			}
		}
	
	}
	
	public void contestarLlamadas() {
			System.out.println("CONTESTA");
		}
}
