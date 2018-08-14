package com.imaginamos.prueba.java.models.entities;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.HashSet;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable{

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cliente")
	private long id;
	@Column(unique=true)
	private long documento;
	private String nombres;
	@Column(unique=true)
	private String correo;
	private int edad;
	  @OneToOne(fetch = FetchType.EAGER, optional = false)
	  @JoinColumn(name="id_login")
    private Login login;

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDocumento() {
		return documento;
	}

	public void setDocumento(long documento) {
		this.documento = documento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void setUsuario(HashSet<Login> hashSet) {
		// TODO Auto-generated method stub
		
	}
}
