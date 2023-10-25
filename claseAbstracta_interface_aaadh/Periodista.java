package com;

public class Periodista extends Profesionista implements IMedicina, ILeyes {
	public Periodista () {

}

	@Override
	public void trabajar() {
		System.out.println("Grabar");
		
	}
	// Son metodos implementados representando la tercer forma del polimosfismo (comportamiento forma)
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
	public void hacerCasos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void representacionTribunales() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void asesoraminetoJuridico() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void documentosLegales() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void informesJuicio() {
		// TODO Auto-generated method stub
		
	}
}
