package com.services;

import java.util.List;

import javax.print.attribute.standard.Media;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.ProveedorDAO;
import com.entity.Proveedor;
import com.general.StatusJava;

@Path("proveedor")
public class ProveedorService {

	Proveedor proveedor = null;
	ProveedorDAO dao = null;

	@Path("mostrar")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Proveedor> mostrar() {
		dao = new ProveedorDAO();
		List<Proveedor> list = dao.mostrar();
		System.out.println("datos:" + list);
		return list;
	}
	// http://localhost:8090/CRUDHibernate/CRUDHibernate/proveedor/guardar
	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public StatusJava guardar(Proveedor p) {
		System.out.println("Proveedor a guardar:" + p);
		StatusJava state = new StatusJava();
		state.setOb(p);

		dao = new ProveedorDAO();
		String res = dao.guardar(p);

		if (res.equals("1")) {
			state.setMensaje("Guardado exitosamente");
			state.setRespuesta(res);
		} else {
			state.setMensaje("No fue posible guardar");
			state.setRespuesta(res);
		}
		return state;
	}
	// http://localhost:8090/CRUDHibernate/CRUDHibernate/proveedor/eliminar/10
	@Path("eliminar/{id}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public StatusJava eliminar(@PathParam("id") int id) {
		StatusJava state = new StatusJava();
		state.setOb(id);

		dao = new ProveedorDAO();
		String res = dao.eliminar(id);

		if (res.equals("1")) {
			state.setMensaje("Eliminado exitosamente");
			state.setRespuesta(res);
		} else {
			state.setMensaje("No fue posible eliminar este registro");
			state.setRespuesta(res);
		}
		return state;
	}
	// http://localhost:8090/CRUDHibernate/CRUDHibernate/proveedor/editar
	@Path("editar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public StatusJava editar(Proveedor p) {
		StatusJava state = new StatusJava();
		state.setOb(p);

		dao = new ProveedorDAO();
		String res = dao.editar(p);

		if (res.equals("1")) {
			state.setMensaje("Actualizado exitosamente");
			state.setRespuesta(res);
		} else {
			state.setMensaje("No fue posible actualizar este registro");
			state.setRespuesta(res);
		}
		return state;
	}
	// http://localhost:8090/CRUDHibernate/CRUDHibernate/proveedor/buscar-por-id/5
	@Path("buscar-por-id/{id}")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Proveedor buscar(@PathParam("id") int id) {

		dao = new ProveedorDAO();
		proveedor = (Proveedor) dao.buscar(id);
		System.out.println("Se encontro el registro");

		return proveedor;
	}
}
