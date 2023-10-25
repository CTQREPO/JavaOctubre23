package com;

//Las interfaces son 100% publicas, son acciones 
//Contienen solo metodos abstractos y probablemente constantes 
//Por default, son metodos publicos 
public interface IMedicina {

	void hacerRCP();
	void inyectar();
	void medirPresion();
	
	
	
}
//Astracto contiene atributos, getters y sertters. Es un modelo
//Interfaces no hay atributos, puros metodos abstractos. Es un contracto 