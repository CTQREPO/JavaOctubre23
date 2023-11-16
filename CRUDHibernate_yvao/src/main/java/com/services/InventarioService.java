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

@Path("inventario")
public class InventarioService {

	Inventario inventario = null;
	InventarioDAO dao = null;
	
	//https://localhost:8090/CRUDHibernate_yvao/CRUDHibernate_yvao/inventario/mostrar
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Inventario>mostrar(){
		dao = new InventarioDAO();
		List<Inventario> list = dao.mostrar();
		System.out.println("datos:" + list);
		return list;
	}
	
	//https://localhost:8090/CRUDHibernate_yvao/CRUDHibernate_yvao/inventario/guardar
	@Path("guardar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Inventario i) {
		System.out.println("Inventario a guardar:" + i);
		Status state = new Status();
		state.setOb(i);
		
		dao = new InventarioDAO();
		String res = dao.guardar(i);
		
		if(res.equals("1")) {
			state.setMensaje("Guardado exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible guardar");
			state.setRespuesta(res);
		}
		return state;
	}
	//https://localhost:8090/CRUDHibernate_yvao/CRUDHibernate_yvao/inventario/eliminar/{id}
	@Path("eliminar/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id") int id) {
		Status state = new Status();
		state.setOb(id);
		
		dao = new InventarioDAO();
		String res = dao.eliminar(id);
		
		if(res.equals("1")) {
			state.setMensaje("Eliminado exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible eliminar este registro");
			state.setRespuesta(res);
		}
		return state;
	}
	
	//https://localhost:8090/CRUDHibernate_yvao/CRUDHibernate_yvao/inventario/editar
	@Path("editar")
	@POST
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(Inventario i) {
		Status state = new Status();
		state.setOb(i);
		
		dao = new InventarioDAO();
		String res = dao.editar(i);
		
		if(res.equals("1")) {
			state.setMensaje("Actaulizado correctamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible actualizar este registro");
			state.setRespuesta(res);
		}
		return state;
	}
	//https://localhost:8090/CRUDHibernate_yvao/CRUDHibernate_yvao/inventario/buscar-por-id/id
	@Path("buscar-por-id/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Inventario buscar(@PathParam("id") int id) {
		dao = new InventarioDAO();
		inventario= (Inventario) dao.buscar(id);
		System.out.println("Se encontro el registro");
		return inventario;
	}
}
