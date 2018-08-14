package com.imaginamos.prueba.java.models.entities.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.imaginamos.prueba.java.models.entities.Login;
@Repository

public class LoginImplDao implements ILoginDao {

	@PersistenceContext
	EntityManager em;

	@Override
	public Login buscar(String usuario, String contrasena) {
		try {
				Query q=em.createNativeQuery("select * from login where usuario = ? and contrasena= ?",Login.class);
				q.setParameter(1, usuario);
				q.setParameter(2,contrasena);
				Login l=(Login) q.getSingleResult();
				return l;
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Login> findAll() {
		// TODO Auto-generated method stub
		Query q=em.createNativeQuery("select * from login");
		return (List<Login>) q.getResultList();
	}

	@Override
	public Login findById(Long id) {
		// TODO Auto-generated method stub
		return em.find(Login.class, id);
	}
	@Transactional
	@Override
	public void save(Login login) {
		// TODO Auto-generated method stub
		em.persist(login);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Login login= findById(id);
		em.remove(login);
	}

}
