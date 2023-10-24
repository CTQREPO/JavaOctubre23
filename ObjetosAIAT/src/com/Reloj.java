package com;
import java.sql.Date;
public class Reloj {
 //Estructura de una clase 
 /*  * Atributos
  * Constructores  * Getters & Setters
  * toString  * 
  * Comportamineto  * 1- Metodos negativos
  * 2- Metodos heredados (se sobreescriben)  * 3- Metodos implementados (traidos de interfaces)
  */ 
 String tipo, color, forma, material, mecanismo, tama�o; double precio;
 //Objeto instancia con el contructor vac�o public Reloj () {
   
 public Reloj (String color, String mecanismo) {  this.color=color;
  this.mecanismo=mecanismo;  
 }
 public Reloj(String tipo, String color, String forma, String material, String mecanismo, String tama�o, double precio) {  this.tipo = tipo;
  this.color = color;  this.forma = forma;
  this.material = material;  this.mecanismo = mecanismo;
  this.tama�o = tama�o;  this.precio=precio;
    
 }
 public String getTipo() {  return tipo;
 }
 public void setTipo(String tipo) {  this.tipo = tipo;
 }
 public String getColor() {  return color;
 }
 public void setColor(String color) {  this.color = color;
 }
 public String getForma() {  return forma;
 }
 public void setForma(String forma) {
  this.forma = forma; }
 public String getMaterial() {
  return material; }
 public void setMaterial(String material) {
  this.material = material; }
 public String getMecanismo() {
  return mecanismo; }
 public void setMecanismo(String mecanismo) {
  this.mecanismo = mecanismo; }
 public String getTama�o() {
  return tama�o; }
 public void setTama�o(String tama�o) {
  this.tama�o = tama�o; }
 public double getPrecio() {
  return precio; }
 public void setPrecio(double precio) {
  this.precio = precio; }
 //Se agreg� met�do toString @Override
 public String toString() {  return "Reloj [tipo=" + tipo + ", color=" + color + ", forma=" + forma + ", material=" + material
    + ", mecanismo=" + mecanismo + ", tama�o=" + tama�o + ", precio=" + precio + "]"; }
 // public String consutarHora () {
//  Date d = new Date ();//   return "La hora es:"+ d.getHours()+":"+d.getMinutes();
//   
 public void consultarHora () {  Date d=new Date (0);
  System.out.println("La horas es:"+d.getHours()+":+ d.getMinutes());"); }
}