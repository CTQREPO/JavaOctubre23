package com;

// H E R E N C I A

public class Smartwatch extends reloj{

	String so;		//sistema operativo
	String sensores;
	
	//COMPOSICION
	
	pantalla p1; //integrar un objeto de la clase pantalla
	//procesador	
	
	public Smartwatch() {
		
	}

	public Smartwatch(String so, String sensores) {
		super();
		this.so = so;
		this.sensores = sensores;
	}

	public Smartwatch(String tipo, String color, String forma, String material, String mecanismo, String tamaño,
			double precio, String so, String sensores, pantalla p1) {
		super(tipo, color, forma, material, mecanismo, tamaño, precio);
		this.so = so;
		this.sensores = sensores;
		this.p1 = p1;
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
	
	//COMPORTAMIENTO
	//1-METODOS NATIVOS
	
	@Override
	public String toString() {
		return "Smartwatch [so=" + so + ", sensores=" + sensores + ", p1=" + p1 + ", tipo=" + tipo + ", color=" + color
				+ ", forma=" + forma + ", material=" + material + ", mecanismo=" + mecanismo + ", tamaño=" + tamaño
				+ ", precio=" + precio + "]";
	}

	public void cronometro(int min, int seg) {
		for (int i = 0; i < min; i++) {
			for (int j = 0; j < seg; j++) {
				System.out.println("[ "+i+":"+j+" ]");			
			}
		}
	}

	public void medirOxigeno() {
		System.out.println("95%...");
	}
	
	public void contestarLlamadas() {
		System.out.println("");
	}
	
		
	
}
