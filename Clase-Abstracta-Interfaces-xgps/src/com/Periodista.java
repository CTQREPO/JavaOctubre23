package com;
//tercer forma de polimorfismo 
public class Periodista extends Profesionista implements IMedicina, ILeyes{

	public Periodista() {
	}
	
	
	
	@Override
	public void trabajar() {
		System.out.println("Grabar");
	}

//Metodos implementados (comportamiento forma 3)

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
	public void asesorar() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void investigarLeyes() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mentir() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void litigar() {
		// TODO Auto-generated method stub
		
	}
	}
	

