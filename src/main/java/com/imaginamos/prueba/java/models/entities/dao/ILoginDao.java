package com.imaginamos.prueba.java.models.entities.dao;

import org.springframework.data.repository.CrudRepository;

import com.imaginamos.prueba.java.models.entities.Login;

public interface ILoginDao extends CrudRepository<Login, Long>{

}
