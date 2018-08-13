package com.imaginamos.prueba.java.models.entities.service;

import java.util.List;

import com.imaginamos.prueba.java.models.entities.Cliente;

public interface IClienteService {
	
	public List<Cliente>findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
}
