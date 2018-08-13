package com.imaginamos.prueba.java.models.entities.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imaginamos.prueba.java.models.entities.Tienda;
import com.imaginamos.prueba.java.models.entities.dao.ITiendaDao;

@Service

public class TiendaServiceImpl implements ITiendaService {

	@Autowired
	private ITiendaDao tiendaDao;
	@Override
	public List<Tienda> findAll() {
		// retorna el listado
		return (List<Tienda>) tiendaDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Tienda findById(Long id) {
		// TODO Auto-generated method stub
		return tiendaDao.findById(id).orElse(null);
	}

	@Override
	public Tienda save(Tienda tienda) {
		// TODO Auto-generated method stub
		return tiendaDao.save(tienda);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
	tiendaDao.deleteById(id);	
	}

}
