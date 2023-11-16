package com;

public class Smartwatch extends Reloj{

	String so, sensores;
	
	
	//Composición de objetos
	Pantalla pantalla;
	
	public Smartwatch() {
		
	}

	public Smartwatch(String so, String sensores) {
		super();
		this.so = so;
		this.sensores = sensores;
	}
	


	public Smartwatch(String tipo, String color, String mecanismo, String material, String forma, String tamanio,
			double precio, String so, String sensores, Pantalla pantalla) {
		super(tipo, color, mecanismo, material, forma, tamanio, precio);
		this.so = so;
		this.sensores = sensores;
		this.pantalla = pantalla;
	}

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



@Override
	public String toString() {
		return "Smartwatch [so=" + so + ", sensores=" + sensores + ", pantalla=" + pantalla + ", tipo=" + tipo
				+ ", color=" + color + ", mecanismo=" + mecanismo + ", material=" + material + ", forma=" + forma
				+ ", tamanio=" + tamanio + ", precio=" + precio + "]";
	}

	//  Comportamiento
	//Métodos nativos
	public void timer(int min, int seg) {
		for (int i = 0; i < min; i++) {
			for (int j = 0; j < seg; j++) {
				System.out.println("[" + i + ":" + j + "]");
			}
		}
	}
	
	public void medirOxigeno() {
		System.out.println("Oxigeno al: 96%");
	}
	
	
	public void contestarLlamadas() {
		System.out.println("Contestar");
	}
}
