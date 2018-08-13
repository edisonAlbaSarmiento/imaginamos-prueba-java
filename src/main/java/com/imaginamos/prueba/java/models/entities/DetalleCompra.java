package com.imaginamos.prueba.java.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detallecompra")
public class DetalleCompra implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_detallecompra")
	private long id; 
	private int cantidad_producto_cliente;

	
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public int getCantidad_producto_cliente() {
		return cantidad_producto_cliente;
	}



	public void setCantidad_producto_cliente(int cantidad_producto_cliente) {
		this.cantidad_producto_cliente = cantidad_producto_cliente;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
