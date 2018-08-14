package com.imaginamos.prueba.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.imaginamos.prueba.java.models.entities.Login;
import com.imaginamos.prueba.java.models.entities.service.ILoginService;

@RestController
@RequestMapping("/api")
public class LoginREstController {
	
	@Autowired
	private ILoginService loginService;
	
	@GetMapping("/logins")
	public List<Login> index(){
		return loginService.findAll();
	}
	@GetMapping("/logins/{id}")
	public Login show (@PathVariable Long id) {
		return loginService.findById(id);
	}
	
	@PostMapping("/logins")
	@ResponseStatus(HttpStatus.CREATED)
	public Login create (@RequestBody Login login) {
		return loginService.save(login);
	}
	@PostMapping("/logueo")
public Login logueado(@RequestBody Login login) {
		
		Login l=loginService.buscar(login.getUsuario(),login.getContrasena());
		if(l==null) {
			return new Login();
		} else {
			l.setContrasena("******");
			return l;
		}	
	}
	
	@PutMapping("/logins/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Login update (@RequestBody Login login,@PathVariable Long id) {
		
		Login loginActual = loginService.findById(id);
		
		loginActual.setUsuario(login.getUsuario());
		loginActual.setContrasena(login.getContrasena());
		return loginService.save(loginActual);
	}
	
	@DeleteMapping("/logins/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		loginService.delete(id);
	}
	
	
}
