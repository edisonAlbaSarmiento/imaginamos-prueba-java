package com.imaginamos.prueba.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.imaginamos.prueba.java.models.entities.Compra;
import com.imaginamos.prueba.java.models.entities.service.ICompraService;

@RestController
@RequestMapping("/api")
public class CompraController {
	@Autowired
	
	private ICompraService compraService;
	
	@GetMapping("/compras")
	public List<Compra>index(){
		return compraService.findAll();
	}
	@GetMapping("/compras/{id}")
	public Compra show(@PathVariable Long id) {
		return compraService.findById(id);
	}
	@PostMapping("/compras")
	@ResponseStatus(HttpStatus.CREATED)
	public Compra create(@RequestBody Compra compra) {
		return compraService.save(compra);
	}
	
	
}
