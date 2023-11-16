package com;
//simulacion de multiherencia

public class Periodista extends Profesionista implements IMedicina, ILeyes{

	public Periodista() {
		
	}
	

	@Override
	public void trabajar() {
		System.out.println("Grabar");
	}

     //Metodos implementados (comportamientos forma 3--->mutar una clase a partir de heredar o implementar metodos)
	@Override
	public void hacerRCP() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void inyectar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void medirPresion() {
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
	public void documentar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void leerLeyes() {
		// TODO Auto-generated method stub
		
	}
	
	//dos o mas interfaces pueden ser implementadas en una clase

	
}
