package com.imaginamos.prueba.java.models.entities.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imaginamos.prueba.java.models.entities.DetalleCompra;
import com.imaginamos.prueba.java.models.entities.dao.IDetalleCompraDao;

@Service
public class DetalleCompraImpl implements IDetalleCompraService  {
	
	@Autowired
	private IDetalleCompraDao detallecompraDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<DetalleCompra> findAll() {
		// TODO Auto-generated method stub
		return  (List<DetalleCompra>) detallecompraDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public DetalleCompra findById(Long id) {
		// TODO Auto-generated method stub
		return detallecompraDao.findById(id).orElse(null);
	}

	@Override
	public DetalleCompra save(DetalleCompra detallecompra) {
		// TODO Auto-generated method stub
		return detallecompraDao.save(detallecompra);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		detallecompraDao.deleteById(id);
	}

}
