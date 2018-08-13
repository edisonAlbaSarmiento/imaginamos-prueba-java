package com.imaginamos.prueba.java.models.entities.service;

import java.util.List;

import com.imaginamos.prueba.java.models.entities.DetalleProductoTienda;

public interface IDetalleProductoTiendaService {


	public List<DetalleProductoTienda>findAll();
	
	public DetalleProductoTienda findById(Long id);
	
	public DetalleProductoTienda save(DetalleProductoTienda detalleproductotienda);
	
	public void delete(Long id);
}
