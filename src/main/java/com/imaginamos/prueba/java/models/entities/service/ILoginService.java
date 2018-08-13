package com.imaginamos.prueba.java.models.entities.service;

import java.util.List;

import com.imaginamos.prueba.java.models.entities.Login;

public interface ILoginService {
	
	public List<Login>findAll();
	
	public Login findById(Long id);
	
	public Login save(Login login);
	
	public void delete(Long id);
}
