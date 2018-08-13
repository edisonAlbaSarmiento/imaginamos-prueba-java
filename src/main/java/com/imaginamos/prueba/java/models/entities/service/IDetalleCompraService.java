package com.imaginamos.prueba.java.models.entities.service;

import java.util.List;

import com.imaginamos.prueba.java.models.entities.DetalleCompra;

public interface IDetalleCompraService {

	public List<DetalleCompra>findAll();
	
	public DetalleCompra findById(Long id);
	
	public DetalleCompra save(DetalleCompra detallecompra);
	
	public void delete(Long id);
}
