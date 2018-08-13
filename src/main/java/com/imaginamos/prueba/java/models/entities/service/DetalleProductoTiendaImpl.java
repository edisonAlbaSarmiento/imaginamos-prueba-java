package com.imaginamos.prueba.java.models.entities.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imaginamos.prueba.java.models.entities.DetalleProductoTienda;
import com.imaginamos.prueba.java.models.entities.dao.IDetalleProductoTiendaDao;

@Service
public class DetalleProductoTiendaImpl implements IDetalleProductoTiendaService {

	@Autowired
	private IDetalleProductoTiendaDao detalleproductotiendaDao;

	@Override
	@Transactional(readOnly=true)
	public List<DetalleProductoTienda> findAll() {
		
		return 	(List<DetalleProductoTienda>) detalleproductotiendaDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public DetalleProductoTienda findById(Long id) {
		// TODO Auto-generated method stub
		return detalleproductotiendaDao.findById(id).orElse(null);
	}

	@Override
	public DetalleProductoTienda save(DetalleProductoTienda detalleproductotienda) {
		// TODO Auto-generated method stub
		return detalleproductotiendaDao.save(detalleproductotienda);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		detalleproductotiendaDao.deleteById(id);
	}
	
	

}
