package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.InventarioDAO;
import com.entity.Inventario;
import com.general.Status;

@Path ("Inventario")
public class InventarioService {

	Inventario inventario = null;
	InventarioDAO dao = null;
	Status status = null;
	
	//http://localhost:8090/JDBCWEB_yvao/JDBCWEB_yvao/inventario/guardar
	@Path("guardar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Inventario inve){
		status = new Status();
		status.setOb(inve);
		dao = new InventarioDAO();
		
		String respuesta = dao.guardar(inve);
		
		if(respuesta.contentEquals("1")){
			status.setMensaje("OK");
			status.setRespuesta(respuesta);
		}else {
			status.setMensaje("ERROR");
			status.setRespuesta(respuesta);
		}
		return status;
	}

	//http://localhost:8090/JDBCWeb_yvao/JDBCWeb_yvao/inventario/actualizar	
		@Path("actualizar")
		@POST
		@Consumes({MediaType.APPLICATION_JSON})
		@Produces({MediaType.APPLICATION_JSON})
		public Status actualizar(Inventario inve) {
			status = new Status();
			status.setOb(inve);
			dao = new InventarioDAO();
			
			String respuesta = dao.actualizar(inve);
			
			if(respuesta.contentEquals("1")){
				status.setMensaje("OK");
				status.setRespuesta(respuesta);
			}else {
				status.setMensaje("ERROR");
				status.setRespuesta(respuesta);
			}
			return status;
		}	
		//http://localhost:8090/JDBCWEB_yvao/JDBCWEB_yvao/inventario/eliminar/10
		@Path("eliminar/{id}")
		@GET
		@Produces({MediaType.APPLICATION_JSON})
		public Status eliminar(@PathParam("id")int id) {
			status = new Status();
			dao = new InventarioDAO();
			String respuesta = dao.eliminar(id);
			
			if(respuesta.equals("1")){
				status.setMensaje("OK");
				status.setRespuesta(respuesta);
			}else {
				status.setMensaje("ERROR");
				status.setRespuesta(respuesta);
			}
			return status;
		}
		//http://localhost:8090/JDBCWEB_yvao/JDBCWEB_yvao/inventario/buscar-por-id/5
		@Path("buscar-por-id/{id}")
		@GET
		@Produces({MediaType.APPLICATION_JSON})
		public Inventario buscar(@PathParam("id")int id) {
			status = new Status();
			dao = new InventarioDAO();
			inventario = (Inventario) dao.buscar(id);
			return inventario;
		}
		//http://localhost:8090/JDBCWEB_yvao/JDBCWEB_yvao/inventario/mostrar
		@Path("mostrar")
		@GET
		@Produces({MediaType.APPLICATION_JSON})
		public List mostrar() {
			dao = new InventarioDAO();
			return dao.mostrar();
		}
		
	
	
	
	
	
	
	
}
