package com.imaginamos.prueba.java.models.entities.service;

import java.util.List;

import com.imaginamos.prueba.java.models.entities.Tienda;

public interface ITiendaService {

	public List<Tienda> findAll();

	public Tienda findById(Long id);

	public Tienda save(Tienda login);

	public void delete(Long id);
}
