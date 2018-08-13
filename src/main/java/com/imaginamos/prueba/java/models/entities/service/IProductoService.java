package com.imaginamos.prueba.java.models.entities.service;

import java.util.List;

import com.imaginamos.prueba.java.models.entities.Producto;

public interface IProductoService {

	public List<Producto>findAll();
	
	public Producto findById(Long id);
	
	public Producto save(Producto login);
	
	public void delete(Long id);
}
