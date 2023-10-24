package com;

public class Smartwatch extends Reloj{
//atributos agregados a los ya heredados
	String so; //*
	String sensores;
	
	Pantalla pantalla; //composicion de objeto
	// procesador
	
	
	//constructor vacio
	public Smartwatch() {
		
	}

	public Smartwatch(String so, String sensores) {
		super();
		this.so = so;
		this.sensores = sensores;
	}
	
	public Smartwatch(String tipo, String color, String forma, String material, String mecanismo, String tamaño,
			double precio, String so, String sensores, Pantalla pantalla) {
		super(tipo, color, forma, material, mecanismo, tamaño, precio);
		this.so = so;
		this.sensores = sensores;
		this.pantalla = pantalla;
	}

// getters && setters
	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public String getSensores() {
		return sensores;
	}

	public void setSensores(String sensores) {
		this.sensores = sensores;
	}

	// toString
	
	@Override
	public String toString() {
		return "Smartwatch [so=" + so + ", sensores=" + sensores + ", pantalla=" + pantalla + ", tipo=" + tipo
				+ ", color=" + color + ", forma=" + forma + ", material=" + material + ", mecanismo=" + mecanismo
				+ ", tamaño=" + tamaño + ", precio=" + precio + "]";
	}

	//comportamiento
	//1- Metodos nativos
	
	public void cronometro(int min,int seg) {
		for (int i = 0; i< min; i++) {
			for(int j = 0; j<seg; j++) {
				System.out.println("["+i+":"+j+"]");
			}
		}
		
	}
	
	public void medirOxigeno() {
		System.out.println("95&....");
	}
	
	public void contestarLlamadas() {
		System.out.println("");
	}
	

	
	
	
	
	
}
