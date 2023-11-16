package com.services;


import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.ProductoDAO;
import com.dto.ProductosPorClienteDTO;
import com.dto.ProductosStockDTO;
import com.entity.Productos;
import com.general.Status;

@Path("productos")
public class ProductoService {

	Productos producto = null;
	ProductoDAO dao = null;
	Status status = null;
	
	
	//https://localhost:8090/JDBCWEB_yvao/JDBCWEB_yvao/productos/guardar/
	@Path("guardar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Productos prod) {

		status = new Status();
		status.setOb(prod);
		dao = new ProductoDAO();
		
		String respuesta = dao.guardar(prod);
		
		if(respuesta.contentEquals("1")){
			status.setMensaje("OK");
			status.setRespuesta(respuesta);
		}else {
			status.setMensaje("ERROR");
			status.setRespuesta(respuesta);
		}
		return status;
	}
	
	//https://localhost:8090/JDBCWeb_yvao/JDBCWeb_yvao/productos/actualizar/
	@Path("actualizar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status actualizar(Productos prod) {
		status = new Status();
		status.setOb(prod);
		dao = new ProductoDAO();
		
		String respuesta = dao.actualizar(prod);
		
		if(respuesta.contentEquals("1")){
			status.setMensaje("OK");
			status.setRespuesta(respuesta);
		}else {
			status.setMensaje("ERROR");
			status.setRespuesta(respuesta);
		}
		return status;
	}
	
	//http://localhost:8090/JDBCWeb_yvao/JDBCWeb_yvao/productos/eliminar/10
	@Path("eliminar/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id")int id) {
		status = new Status();
		dao = new ProductoDAO();
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
	//https://localhost:8090/JDBCWeb_yvao/JDBCWeb_yvao/productos/buscar-por-id/5
	@Path("buscar-por-id/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Productos buscar(@PathParam("id")int id) {
		status = new Status();
		dao = new ProductoDAO();
		producto = (Productos) dao.buscar(id);
		return producto;
	}
	//https://localhost:8090/JDBCWeb_yvao/JDBCWeb_yvao/productos/mostrar
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List mostrar() {
		dao = new ProductoDAO();
		return dao.mostrar();
	}
	//http://localhost:8090/JDBCWEB_yvao/JDBCWEB_yvao/productos/getProductosStockOnPrecioCompraOver/900
	@Path("getProductosStockOnPrecioCompraOver/{precio}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List getProductosStockOnPrecioCompraOver(@PathParam("precio")double precio) {
		dao = new ProductoDAO();
		return dao.getProductosStockOnPrecioCompraOver(precio);
}
	 // http://localhost:8090/JDBCWEB_yvao/JDBCWEB_yvao/productos/productos-por-cliente/nombre 
	 @Path("productos-por-cliente/{nombre}") 
	 @GET 
	 @Produces({ MediaType.APPLICATION_JSON }) 
	 public ProductosPorClienteDTO getProductosPorCliente(@PathParam("nombre") String nombre) { 
	  dao = new ProductoDAO(); 
	  return dao.getProductosPorCliente(nombre); 
	 }
	
	
	
}