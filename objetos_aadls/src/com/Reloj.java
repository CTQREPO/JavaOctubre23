package com;

import java.util.Date;

public class Reloj {

	//estructura de una clase
	 /*
	  Atributos
	  Constructores
	  Getter & Setters
	  toString
	  
	  *Comportamiento
	  *1- metodos nativos
	  *2- metodos heredados (se sobreescriben)
	  *3- metodos implementados (traidos de interfaces)
	  */
	
	//una clase es la sintetizaci�n de un objeto f�sico o abstracto
	//tambien se le considera un medelo o plantilla
/*conceptos:
 * tipo
 * color
 * tama�o 
 * forma
 * material
 * mecanismo
 * */
	
	String tipo, color, forma, material, mecanismo, tama�o;
    double precio;
    
	public Reloj() {
    
    }
//sobrecarga de metodos: sucede cuando defines uno o mas metodos con el mismo nombre pero diferente cantidad y tipos de argumentos
	
	public Reloj(String color, String mecanismo) {
		this.color = color;
		this.mecanismo = mecanismo;
	}
	public Reloj(String tipo, String color, String forma, String material, String mecanismo, String tama�o,
			double precio) {
		this.tipo = tipo;
		this.color = color;
		this.forma = forma;
		this.material = material;
		this.mecanismo = mecanismo;
		this.tama�o = tama�o;
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMecanismo() {
		return mecanismo;
	}

	public void setMecanismo(String mecanismo) {
		this.mecanismo = mecanismo;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Reloj [tipo=" + tipo + ", color=" + color + ", forma=" + forma + ", material=" + material
				+ ", mecanismo=" + mecanismo + ", tama�o=" + tama�o + ", precio=" + precio + "]";
	}

    
	public String consultaHora() {
		Date d =  new Date();
		
		return "la hora es: "+ d.getHours()+ ":"+d.getMinutes();
	}
	
//	public void consultaHora() {
//		Date d = new Date();
//		System.out.println("la hora es: "+d.getHours()+":"+d.getMinutes());
//	}
	
}

