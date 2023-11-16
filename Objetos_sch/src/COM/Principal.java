package COM;

public class Principal {

	public static void main(String[] args) {
		
		//objeto instanciado con el constructor vacio
		Reloj r1 = new Reloj();
		r1.setPrecio(35.00);
		r1.setForma("Cuadrado");
		r1.setTipo("Pulsera");
		
		System.out.println(r1);
		//objeto instanciado con el constructor de todos los paranetros
		Reloj r2 = new Reloj("pulsera", "azul", "redondo", "goma", "digital", "pequeño", 100.00);
		System.out.println(r2);
		
		Reloj r3 = new Reloj("negro","manecillas");
		System.out.println(r3);
		
		
		System.out.println(r1.consultahora());
		System.out.println(r1.getPrecio());
		
		r1.setPrecio(35.1);
		System.out.println(r1.getPrecio());
		System.out.println(r1.getForma());
		
		r1.consultahora(); //para llamar a un void
		
//		Motos m1 = new Motos();
//		m1.setCilindrada(1000);
//		m1.setModelo("R1");
//		m1.setMarca("Yamaha");
//		System.out.println(m1);
//		
//		Motos m2 = new Motos("Verde", "Deportiva", "Kawazaki", "Ninja H2R", "Nueva", 998, 850000.00 );
//		System.out.println(m2);
//		
//		Motos m3 = new Motos("Yamaha",1000000.0);
//		System.out.println(m3);
//		
//		System.out.println(m1.seguro());
		Pantalla Pantalla = new Pantalla("240X320", "TFT", 2.00, 80);
		
		Smartwatch sm1= new Smartwatch("Android OS", "Infrarrojos, Presion");
		Smartwatch sm2= new Smartwatch("pulsera", "negro", "redondo", "plastico", "digital", "mediano", 900.00, "IOS", "Pasos, Presion",Pantalla);
		
		System.out.println(sm1);
		System.out.println(sm2);
		
		
		
	
		
		
		
		
		
	}
}
