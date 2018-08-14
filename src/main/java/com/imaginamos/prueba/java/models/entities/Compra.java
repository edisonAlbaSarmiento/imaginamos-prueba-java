package com.imaginamos.prueba.java.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compra")
public class Compra implements Serializable{

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_compra")
	private long id;
	private float total_compra;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getTotal_compra() {
		return total_compra;
	}

	public void setTotal_compra(float total_compra) {
		this.total_compra = total_compra;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
