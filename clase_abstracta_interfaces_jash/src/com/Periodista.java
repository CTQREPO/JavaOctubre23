package com;

public class Periodista extends Profesionista implements IMedicina,ILeyes{
	
	public Periodista() {
		
	}
	
	@Override
	public void trabajar() {
		System.out.println("Grabar");
		
	}
	
	//Metodos implememntados(comportamiento forma 3 del polimorfismo)

	@Override
	public void investigar() {
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

	@Override
	public void hacerRPC() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inyectar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void medirPrecion() {
		// TODO Auto-generated method stub
		
	}

}

