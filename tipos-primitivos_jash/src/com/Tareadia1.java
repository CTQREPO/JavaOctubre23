package com;
//investigar los tipos de objeto o los wrappers (envoltorios)
//setencias if swite 

public class Tareadia1 {
	
	//Byte: java.lang.Byte	
	//Short: java.lang.Short
	//Integer: java.lang.Integer
	//Long: java.lang.Long
	
	//Float: java.lang.Float
	//Double: java.lang.Double
	
	//Character: java.lang.Character
	//Boolean: java.lang.Boolean
	
	//nos permite transformar valores primivos en objetos con la finalidad 
	//de poder utilizarlo en la programacion orient ada a objetos 
	


	    public static void main(String[] args) {
	        Tareadia1 principaltarea = new Tareadia1();
	        //String resultado = principaltarea.ifElse();
	        String resultado = principaltarea.switchr();
	        System.out.println(resultado);
	    }
	    
	    public String ifElse() {
	        String respuesta;
	        String edadComoTexto = "16"; // Simulando una entrada de formulario HTML
	        int edad = Integer.parseInt(edadComoTexto);
	        
	        if (edad >= 18) {
	            respuesta = "El usuario es mayor de edad.";
	        } else {
	            respuesta = "El usuario es menor de edad.";
	        }
	        return respuesta;
	    }
	    public String switchr() {
	    int diaDeLaSemana = 2; // 

        String nombreDia;

        switch (diaDeLaSemana) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Número de día inválido";
        }
	    return nombreDia;
	    }
	}

	    

