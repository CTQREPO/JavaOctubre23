package com;
//las interfaces no se heredan se implementan
public class Periodista extends profesionista implements IMedicina, ILeyes{
	
	public Periodista() {
		
	}
 @Override
 public void trabajar () {
	 System.out.println("Grabar");
 }
@Override
public void hcerRCP() {
	
	
}
@Override
public void inyectar() {
	
	
}
@Override
public void medirPresion() {
	
	
}
@Override
public void conocerdeleyes() {
	
	
}
@Override
public void conocerdeterminos() {
	
	
}
@Override
public void Litigar() {
	
	
}
@Override
public void Invertigar() {
	
	
}
 
 //2.- Dos o mas interfaces pueden hacer uso de 
}

//Todos estos metodos forman parte del polimorfismo tipo 3 
// primera forma del polimorfismo es la sobrecarga de metodos
//segunda forma es la sobreescritura de metodos
//la tercer fora se define como mutar una claseapartir de heredar o implementar metodos con interfaces.