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
		return loginDao.findById(id);
	}
	@Override
	public Login buscar(String usuario,String contrasena) {
	Login login = loginDao.buscar(usuario, contrasena);
	return login;
	}

	@Override
	public Login save(Login login) {
		// TODO Auto-generated method stub
		loginDao.save(login);
		return login;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		loginDao.delete(id);
	}

}
