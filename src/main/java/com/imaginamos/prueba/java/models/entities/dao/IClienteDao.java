package com.imaginamos.prueba.java.models.entities.dao;

import org.springframework.data.repository.CrudRepository;

import com.imaginamos.prueba.java.models.entities.Cliente;

public interface IClienteDao extends CrudRepository<Cliente,Long>{

}
