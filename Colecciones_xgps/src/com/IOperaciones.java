package com;

import java.util.List;

public interface IOperaciones {
//deposito, retiro, tranferencia
	
	Ticket depositar(Cuenta destino, double monto);  
	 List<Object> retirar(Cuenta origen, double monto); 
	 Ticket transferir(Cuenta origen, Cuenta destino, double monto);
	
}