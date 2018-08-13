package com.imaginamos.prueba.java.models.entities.service;


import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imaginamos.prueba.java.models.entities.Cliente;
import com.imaginamos.prueba.java.models.entities.Login;
import com.imaginamos.prueba.java.models.entities.dao.IClienteDao;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteDao clienteDao;
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		
		return (List<Cliente>) clienteDao.findAll();
	}
	@Override
	@Transactional(readOnly=true)
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
	
		   cliente.setUsuario(new HashSet<Login>());
	
		return clienteDao.save(cliente);
	}
	@Override
	public void delete(Long id) {
	
		clienteDao.deleteById(id);
	}

}
