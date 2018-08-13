package com.imaginamos.prueba.java.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detalleProductoTienda")
public class DetalleProductoTienda implements Serializable {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_detalleproductotienda")
	private long id; 
	private int cantidad_producto_tienda;
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public int getCantidad_producto_tienda() {
		return cantidad_producto_tienda;
	}


	public void setCantidad_producto_tienda(int cantidad_producto_tienda) {
		this.cantidad_producto_tienda = cantidad_producto_tienda;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
