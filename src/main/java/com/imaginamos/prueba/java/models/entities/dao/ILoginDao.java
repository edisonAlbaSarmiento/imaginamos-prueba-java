package com.imaginamos.prueba.java.models.entities.dao;

import java.util.List;



import com.imaginamos.prueba.java.models.entities.Login;

public interface ILoginDao {

public List<Login>findAll();
	
	public Login findById(Long id);
	
	public void save(Login login);
	
	public void delete(Long id);
	
	public Login buscar(String usuario,String contrasena);
}
