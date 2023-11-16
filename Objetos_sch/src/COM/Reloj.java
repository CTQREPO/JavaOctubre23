package COM;

import java.util.Date;

public class Reloj {
	//Estructura de una clase
	
	/* Una clase es la sintetisaci�n de un onjeto fisico o abstracto
	 * tambien se le considera un modelo o plantilla 
	 * 
	 * 
	 * Atributos
	 * constructures
	 * getters & setters
	 * tostring
	 * 
	 * comportamiento
	 * 1- metodos nativos
	 * 2- metodos heredados (se sobreescriben)
	 * 3- metodos implementados (traidos de interfaces)
	 */
	/*
	 * tipo 
	 * color
	 * forma
	 * material
	 * mecanismo
	 * tama�o
	 * 
	 */
	//ATRIBUTOS
	String tipo;
	String color;
	String forma;
	String material;
	String mecanismo;
	String tama�o;
	Double precio;
	//CONSTRUCTORES
	
	public Reloj() {
		
		
	}
	public Reloj(String color, String mecanismo) {
		this.color = color;
		this.mecanismo = mecanismo;
	}
	public Reloj(String tipo, String color, String forma, String material, String mecanismo, String tama�o,
			Double precio) {
		
		super();
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
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Reloj [tipo=" + tipo + ", color=" + color + ", forma=" + forma + ", material=" + material
				+ ", mecanismo=" + mecanismo + ", tama�o=" + tama�o + ", precio=" + precio + "]";
	}
	
	
	public String consultahora(){
		
		Date d = new Date();
		return "La hora es:"+d.getHours()+":"+d.getMinutes();
		
		
	}
//	public void consultahora() {
//		Date d = new Date();
//	System.out.println("La hora es:"+d.getHours()+":"+d.getMinutes());	
//	}
	
	
}
