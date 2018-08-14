package com.imaginamos.prueba.java.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detallecompra")
public class DetalleCompra implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_detallecompra")
	private long id;
	private int cantidad_producto_cliente;

	@ManyToOne(fetch = FetchType.EAGER,optional = false)
	@JoinColumn(name = "id_producto")
	private Producto producto;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_compra")
	private Compra Compra;
	

	public Compra getCompra() {
		return Compra;
	}

	public void setCompra(Compra compra) {
		Compra = compra;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

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
