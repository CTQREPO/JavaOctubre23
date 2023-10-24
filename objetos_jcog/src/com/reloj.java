package com;

import java.util.Date;

public class reloj {
// estructura de una clase
	
	/* 
	 *  una clase es la sintetizacion de un objeto fisico o abstracto tambien
	 *  se le conoce como modelo o plantilla.
	 *  
	 *  
	 *	los metodos constructores son el mecanismo para definir estados iniciales 
	 *	de un objeto.
	 *
	 *
	 *	la sobrecarga de metodos sucede cuando defines uno o mas metodos con el mismo
	 *	nombre pero diferente cantidad y tipos de argumentos
	 *
	 *
	 *	POLIMORFISMO -> sobrecarga de metodos que tengas mismo nombre y funcionan diferente
	 *
	 *
	 *
	 * atributos
	 * constructores
	 * getters & setters
	 * toString
	 * 
	 * comportamiento
	 * 1-metodos nativos
	 * 2- metodos heredados (se sobreescriben)
	 * 3-metodos implementados (traidos de interfaces)
	 *
	 * conceptos:
	 * 
	 * tipo
	 * color
	 * forma
	 * material
	 * mecanismo
	 * tamaño
	 * 
	 */
String tipo, color, forma, material, mecanismo, tamaño;
double precio;

		//sobrecarga de metodos "public reloj()"
	
public reloj(){		//constructor vacio: sirve para crear el objeto aunque no lo tengamos definido				
					
}

public reloj(String color, String mecanismo){	//tengo un constructor que me pide 2 posiciones, si quitas un "", no funciona
	this.color = color;
	this.mecanismo = mecanismo;
}
//click derecho -> SOURCE -> GENERATE CONSTRUCTOR USING FIELDS

public reloj(String tipo, String color, String forma, String material, String mecanismo, String tamaño, double precio) {
	//super();
	this.tipo = tipo;
	this.color = color;
	this.forma = forma;
	this.material = material;
	this.mecanismo = mecanismo;
	this.tamaño = tamaño;
	this.precio = precio;
}

//click derecho -> SOURCE -> GENERATE GETTERS AND SETTERS...

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

public String getTamaño() {
	return tamaño;
}

public void setTamaño(String tamaño) {
	this.tamaño = tamaño;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

//click derecho -> SOURCE -> GENERATE TO STRING().

@Override
public String toString() {
	return "reloj [tipo=" + tipo + ", color=" + color + ", forma=" + forma + ", material=" + material + ", mecanismo="
			+ mecanismo + ", tamaño=" + tamaño + ", precio=" + precio + "]";
}



	public String consultahora() {
	Date d = new Date();
	
	return"la hora es: "+d.getHours()+":"+d.getMinutes();
}
	/*public void consultahora1() {		
		Date d =new Date();
		return "la hora es: "+d.getHours()+":"+d.getMinutes();
	}*/
	
	
	
	
}
