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

import com.imaginamos.prueba.java.models.entities.DetalleProductoTienda;
import com.imaginamos.prueba.java.models.entities.service.IDetalleProductoTiendaService;

@RestController
@RequestMapping("/api")
public class DetalleProductoTiendaController {
	
	@Autowired
	private IDetalleProductoTiendaService detalleproductoTiendaService;

	@GetMapping("/detalleproductotiendas")
	public List<DetalleProductoTienda> index(){
	  return detalleproductoTiendaService.findAll();
	}
	@GetMapping("/detalleproductotiendas/{id}")
	public DetalleProductoTienda show (@PathVariable Long id) {
	  return detalleproductoTiendaService.findById(id);
	}

	@PostMapping("/detalleproductotiendas")
	@ResponseStatus(HttpStatus.CREATED)
	public DetalleProductoTienda create (@RequestBody DetalleProductoTienda detalleproductoTienda) {
	  return detalleproductoTiendaService.save(detalleproductoTienda);
	}

	@PutMapping("/detalleproductotiendas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public DetalleProductoTienda update (@RequestBody DetalleProductoTienda detalleproductoTienda,@PathVariable Long id) {
	  
		DetalleProductoTienda detalleproductoTiendaActual = detalleproductoTiendaService.findById(id);
		
	  return detalleproductoTiendaService.save(detalleproductoTiendaActual);
	}

	@DeleteMapping("/detalleproductotiendas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
	  detalleproductoTiendaService.delete(id);
	}
}
