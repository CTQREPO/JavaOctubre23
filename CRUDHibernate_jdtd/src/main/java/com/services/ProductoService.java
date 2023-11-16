package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.ProductosDAO;
import com.entity.Productos;
import com.general.Status;

@Path("productos")
public class ProductoService {
	Productos producto = null;
	ProductosDAO dao = null;

	@Path("mostrar")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Productos> mostrar() {
		dao = new ProductosDAO();
		List<Productos> list = dao.mostrar();
		System.out.println("datos" + list);
		return list;
	}

	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Status guardar(Productos c) {
		System.out.println("Producto a guardar: " + c);
		Status state = new Status();
		state.setOb(c);

		dao = new ProductosDAO();
		String res = dao.guardar(c);

		if (res.equals("1")) {
			state.setMensaje("Guarddado Exitosamente");
			state.setRespuesta(res);
		} else {
			state.setMensaje("No fue posible guardar");
			state.setRespuesta(res);
		}
		return state;
	}

	@Path("eliminar/{id}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Status eliminar(@PathParam("id") int id) {
		Status state = new Status();
		state.setOb(id);
		dao = new ProductosDAO();
		String res = dao.eliminar(id);
		if (res.equals("1")) {
			state.setMensaje("Elminado Exitosamente");
			state.setRespuesta(res);
		} else {
			state.setMensaje("No fue posible eliminar este registro");
			state.setRespuesta(res);
		}

		return state;

	}

	@Path("editar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Status editar(Productos c) {
		Status state = new Status();
		state.setOb(c);
		dao = new ProductosDAO();
		String res = dao.editar(c);
		if (res.equals("1")) {
			state.setMensaje("Actualizado Exitosamente ");
			state.setRespuesta(res);
		} else {
			state.setMensaje("No fue posible actualizar este registro");
			state.setRespuesta(res);
		}

		return state;

	}
	
	@Path("buscar-po-id/{id}")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Productos buscar(@PathParam("id") int id ) {
		dao = new ProductosDAO();
		producto=(Productos)dao.buscar(id);
		System.out.println("Se encontro el registro");

		return producto;

	}

}
