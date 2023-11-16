package ejercicio;

public class Principal {
	
	public static void main(String[] args) {
		
		animal n1 = new animal();
		
		n1.setNombre("Mochi");
		n1.setTipo_de_animal("Gato");
		n1.setClasificacion("Felino");
		n1.setColor("negro con amarillo");
		
		System.out.println(n1);
		
		animal n2 = new animal("Rocco","Perro","Canino","Grande","Cafe");
		System.out.println(n2);
		
		animal n3 = new animal("Croco","Iguana","Reptil","Pequeño");
		System.out.println(n3);	
		
		System.out.println(n1.consultarAnimal());
		
	}
}
