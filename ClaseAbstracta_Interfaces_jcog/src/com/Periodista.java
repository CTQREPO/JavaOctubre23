package com;

//SIMULACION DE MULTIHERENCIA

public class Periodista extends Profesionista implements IMedicina, ILeyes {

	public Periodista(){
		
	}
	
	@Override
	public void trabajar() {
		System.out.println("Grabar");

		//dos o mas interfaces pueden ser implementadas en una clase	
	
	}
	//sobre carga de metodos (comportamiento forma1 del polimorfismo)
	//sobre escritura que esta dentro de la implemtentacion del metodo (comportamiento forma 2 del polimorfismo)
	//metodos implementados - mutar una clase a partir de heredar o implementar metodos (comportamiento forma 3 del polimorfismo)

	@Override
	public void hacerRCP() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Inyectar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void medirPresion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invesdtigar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void redactarDemandas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void asesorar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void litigar() {
		// TODO Auto-generated method stub
		
	}
	

}
