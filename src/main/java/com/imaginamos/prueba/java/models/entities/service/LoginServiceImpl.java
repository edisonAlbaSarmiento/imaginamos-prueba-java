package com.imaginamos.prueba.java.models.entities.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imaginamos.prueba.java.models.entities.Login;
import com.imaginamos.prueba.java.models.entities.dao.ILoginDao;

@Service
public class LoginServiceImpl implements ILoginService {
 
	@Autowired
	private ILoginDao loginDao;

	@Override
	@Transactional(readOnly=true)
	public List<Login> findAll() {
		// retorna el listado
		return (List<Login>) loginDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Login findById(Long id) {
		// buscar por id
		return loginDao.findById(id).orElse(null);
	}

	@Override
	public Login save(Login login) {
		// para guardar
		return loginDao.save(login);
	}

	@Override
	public void delete(Long id) {
		// para eliminar
		loginDao.deleteById(id);	}
}
