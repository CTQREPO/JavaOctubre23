package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.dto.DetalleProductoDTO;
import com.dto.ProductosPorClienteDTO;
import com.dto.ProductosStockDTO;
import com.entity.Productos;
import com.general.Database;
import com.general.IMetodos;

public class ProductoDAO implements IMetodos {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	Database db = new Database();
	String respuesta = null;
	Productos prod = null;

	@Override
	public String guardar(Object ob) {

		prod = (Productos) ob;// lo convierte a un objeto de la clase productos

		String query = "INSERT INTO PRODUCTOS VALUES (?,?,?,?,?,?,?)";// los signos de interrogacion son marcadores de
																		// posicion

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());// abre la conexion con los
																							// datos nesesarios
			ps = con.prepareStatement(query);

			// acomoda los valores
			ps.setInt(1, 0);
			ps.setInt(2, prod.getDeptoId());
			ps.setNString(3, prod.getNombre());
			ps.setDate(4, prod.getFechaCad());
			ps.setDouble(5, prod.getPrecioCompra());
			ps.setDouble(6, prod.getPrecioVenta());
			ps.setNString(7, prod.getRefrigerado());

			int x = ps.executeUpdate();// sea lo que sea que se ejecute afecta un numero de filas si devuelve un numero
										// mayor a cero es que se agrego una fila si devuelve un cero esque no agrego
										// nada

			if (x > 0) {
				System.out.println("Inserccion exitosa");
				respuesta = "1";
			} else {
				System.out.println("Error al insertar");
				respuesta = "0";
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			respuesta = ex.getMessage();

		}

		return respuesta;
	}

	@Override
	public String actualizar(Object ob) {
		prod = (Productos) ob;

		String query = "UPDATE PRODUCTOS SET DEPTO_ID =?, NOMBRE = ?, FECHA_CAD = ?, "
				+ "PRECIO_COMPRA = ?, PRECIO_VENTA = ?, REFRIGERADO = ? WHERE " + "PRODUCTO_ID = ?";
		// posicion

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());// abre la conexion con los
																							// datos nesesarios
			ps = con.prepareStatement(query);

			// acomoda los valores

			ps.setInt(1, prod.getDeptoId());
			ps.setNString(2, prod.getNombre());
			ps.setDate(3, prod.getFechaCad());
			ps.setDouble(4, prod.getPrecioCompra());
			ps.setDouble(5, prod.getPrecioVenta());
			ps.setNString(6, prod.getRefrigerado());
			ps.setInt(7, prod.getProductos());

			int x = ps.executeUpdate();// sea lo que sea que se ejecute afecta un numero de filas si devuelve un numero
										// mayor a cero es que se agrego una fila si devuelve un cero esque no agrego
										// nada

			if (x > 0) {
				System.out.println("Actualizacion exitosa");
				respuesta = "1";
			} else {
				System.out.println("Error al Actualizar");
				respuesta = "0";
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			respuesta = ex.getMessage();

		}

		return respuesta;
	}

	@Override
	public String eliminar(int id) {
		String query = "DELETE FROM PRODUCTOS WHERE PRODUCTOS_ID = " + id;

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);

			int x = ps.executeUpdate();

			if (x > 0) {
				System.out.println("Eliminacion exitosa");
				respuesta = "1";
			} else {
				System.out.println("Error al Eliminar");
				respuesta = "0";
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			respuesta = ex.getMessage();

		}

		return respuesta;
	}

	@Override
	public Object buscar(int id) {
		String query = "SELECT * FROM PRODUCTOS WHERE PRODUCTO_ID = " + id;
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				prod = new Productos(rs.getInt("PRODUCTO_ID"), rs.getInt("DEPTO_ID"), rs.getString("NOMBRE"),
						rs.getDate("FECHA_CAD"), rs.getDouble("PRECIO_COMPRA"), rs.getDouble("PRECIO_VENTA"),
						rs.getString("REFRIGERADO"));

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return prod;
	}

	@Override
	public List mostrar() {
		List<Productos> productos = new ArrayList<Productos>();
		String query = "SELECT * FROM PRODUCTOS ";
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				prod = new Productos(rs.getInt("PRODUCTO_ID"), rs.getInt("DEPTO_ID"), rs.getString("NOMBRE"),
						rs.getDate("FECHA_CAD"), rs.getDouble("PRECIO_COMPRA"), rs.getDouble("PRECIO_VENTA"),
						rs.getString("REFRIGERADO"));
				// se añade el objeto a la lista
				productos.add(prod);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return productos;
	}
	
	public List<ProductosStockDTO> getProductosStockPrecioCompraOver (double precio){
		
		ProductosStockDTO dto = null;
		List<ProductosStockDTO>productos = new ArrayList<ProductosStockDTO>();
		String query = "SELECT P.NOMBRE, P.FECHA_CAD, P.PRECIO_COMPRA, I.STOCK "
				+ "FROM PRODUCTOS P INNER JOIN INVENTARIO I "
				+ "ON P.PRODUCTO_ID = I.PRODUCTO_ID WHERE PRECIO_COMPRA >"+precio;
//		SELECT P.NOMBRE, P.FECHA_CAD, P.PRECIO_COMPRA, I.STOCKFROM PRODUCTOS P INNER JOIN INVENTARIO I
//		ON P.PRODUCTO_ID = I.PRODUCTO_ID WHERE PRECIO_COMPRA > 600;
		
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				dto = new ProductosStockDTO(rs.getString("NOMBRE"),rs.getDate("FECHA_CAD"),
						rs.getDouble("PRECIO_COMPRA"),rs.getInt("STOCK"));
				
				productos.add(dto);
			}
			
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return productos;
	}
	
	public ProductosPorClienteDTO getProductosPorCliente(String cliente) {
		ProductosPorClienteDTO dto= null;
		List<DetalleProductoDTO>productos = new ArrayList<DetalleProductoDTO>();
		DetalleProductoDTO detalle = null;
		String nombreCliente = "";
		double subtotal = 0.0;
		double total = 0.0;
		String query = 	"SELECT C.NOMBRE AS CLIENTE, P.NOMBRE  AS PRODUCTO, P.PRECIO_VENTA, "
				+ " DT.CANTIDAD, D.NOMBRE AS DEPARTAMENTO " 
				+"FROM CUSTOMERS C " 
				+"INNER JOIN VENTAS V " 
				+"ON C.CLIENTE_ID = V.CLIENTE_ID " 
				+"INNER JOIN DET_VENTA DT " 
				+"ON DT.VENTA_ID = V.VENTA_ID " 
				+"INNER JOIN PRODUCTOS P " 
				+"ON P.PRODUCTO_ID = DT.PRODUCTO_ID " 
				+"INNER JOIN DEPARTAMENTO D "
				+"ON P.DEPTO_ID = D.DEPTO_ID WHERE C.NOMBRE = '"+cliente+"'";
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
			detalle = new DetalleProductoDTO(rs.getString("PRODUCTO"),rs.getDouble("PRECIO_VENTA"),
					rs.getInt("CANTIDAD"),rs.getString("DEPARTAMENTO"));
			productos.add(detalle);
			nombreCliente = rs.getString("CLIENTE");
			subtotal = rs.getDouble("PRECIO_VENTA") * rs.getInt("CANTIDAD");
			total= total + subtotal;
			}
			dto = new ProductosPorClienteDTO(nombreCliente, productos, total);
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		
		return dto;
		
	}
	
	


}
