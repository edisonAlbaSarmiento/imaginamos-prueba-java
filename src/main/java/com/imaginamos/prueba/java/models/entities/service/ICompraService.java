package com.imaginamos.prueba.java.models.entities.service;

import java.util.List;

import com.imaginamos.prueba.java.models.entities.Compra;

public interface ICompraService {
	
	public List<Compra>findAll();

	public Compra findById(Long id);

	public Compra save(Compra compra);

	public void delete(Long id);
}
