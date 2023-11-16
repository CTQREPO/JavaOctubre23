package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Inventario;
import com.general.Database;
import com.general.IMetodos;

public class InventarioDAO implements IMetodos {
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	Database db = new Database();
	String respuesta = null;
	Inventario inve = null;
	
	
	@Override
	public String guardar(Object ob) {
		inve = (Inventario) ob;
		String query = "INSERT INTO INVENTARIO VALUES (?,?,?,?)";
		
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword()); 
			ps = con.prepareStatement(query);
			
			ps.setInt(1, 0);
			ps.setInt(2,inve.getProductos() );
			ps.setInt(3,inve.getStock());
			ps.setDate(4, inve.getFecha());
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				System.out.println("Inserccion Exitosa!");
				respuesta = "1";
			}else {
				System.out.println("Error al Insertar!!!!!!");
				respuesta = "0";
			}
						
		}catch(Exception ex) {
			ex.printStackTrace();
			respuesta = ex.getMessage();
			
		}
		
		return respuesta;
	}
	@Override
	public String actualizar(Object ob) {
		inve=(Inventario) ob;
		
		String query = "UPDATE INVENTARIO SET PRODUCTO_ID =?, STOCK =?, FECHA =?  WHERE "
				+ "INVENTARIO_ID =? ";
		
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword()); 
			ps = con.prepareStatement(query);
			
			ps.setInt(1,inve.getProductos());
			ps.setInt(2, inve.getStock());
			ps.setDate(3, inve.getFecha());
			ps.setInt(4,inve.getInventario_id());
			
			int x = ps.executeUpdate();
			if(x>0) {
				System.out.println("ActualizacionExitosa!!");
				respuesta ="1";
			}else {
				System.out.println("Error al Actualizar!!!!!");
				respuesta = "0";
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
			respuesta = ex.getMessage();		}
		
		return respuesta;
	}
	@Override
	public String eliminar(int id) {
		String query = "DELETE FROM INVENTARIO WHERE INVENTARIO_ID = "+ id;
		
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
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			respuesta = ex.getMessage();
			
		}

		
		return respuesta;
	}
	@Override
	public Object buscar(int id) {
		String query = "SELECT * FROM INVENTARIO WHERE INVENTARIO_ID = "+ id;
		
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				inve = new Inventario(rs.getInt("INVENTARIO_ID"),rs.getInt("PRODUCTO_ID"),rs.getInt("STOCK"),
						rs.getDate("FECHA"));
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		return inve;
	}
	@Override
	public List mostrar() {
		List<Inventario> inventario = new ArrayList<Inventario>();
		String query = "SELECT * FROM INVENTARIO";  
				
		
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				inve = new Inventario(rs.getInt("INVENTARIO_ID"),rs.getInt("PRODUCTO_ID"),rs.getInt("STOCK"),
						rs.getDate("FECHA"));
				
				inventario.add(inve);
			}
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}

		return inventario;
	}
	
	
	

}
