package com.imaginamos.prueba.java.models.entities.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imaginamos.prueba.java.models.entities.Compra;
import com.imaginamos.prueba.java.models.entities.dao.ICompraDao;

@Service
public class CompraServiceImpl implements ICompraService{

	@Autowired
	private ICompraDao compraDao;
	@Override
	@Transactional(readOnly=true)
	public List<Compra> findAll() {
		
		return (List<Compra>)compraDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Compra findById(Long id) {
		
		return compraDao.findById(id).orElse(null);
	}

	@Override
	public Compra save(Compra compra) {
		// TODO Auto-generated method stub
		return compraDao.save(compra);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		compraDao.deleteById(id);
	}

}
