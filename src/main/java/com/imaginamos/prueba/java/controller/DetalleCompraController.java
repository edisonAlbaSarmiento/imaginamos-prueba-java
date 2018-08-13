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

import com.imaginamos.prueba.java.models.entities.DetalleCompra;
import com.imaginamos.prueba.java.models.entities.service.IDetalleCompraService;

@RestController
@RequestMapping("/api")
public class DetalleCompraController {

	@Autowired
	private IDetalleCompraService detallecompraService;
	
	@GetMapping("/detallecompras")
	public List<DetalleCompra> index(){
		return detallecompraService.findAll();
	}
	@GetMapping("/detallecompras/{id}")
	public DetalleCompra show (@PathVariable Long id) {
		return detallecompraService.findById(id);
	}
	
	@PostMapping("/detallecompras")
	@ResponseStatus(HttpStatus.CREATED)
	public DetalleCompra create (@RequestBody DetalleCompra detallecompra) {
		return detallecompraService.save(detallecompra);
	}
	
	@PutMapping("/detallecompras/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public DetalleCompra update (@RequestBody DetalleCompra DetalleCompraDetalleCompra,@PathVariable Long id) {
		
		DetalleCompra DetalleCompraActual = detallecompraService.findById(id);
		DetalleCompraActual.setCantidad_producto_cliente(DetalleCompraActual.getCantidad_producto_cliente());
		return detallecompraService.save(DetalleCompraActual);
	}
	
	@DeleteMapping("/detallecompras/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		detallecompraService.delete(id);
	}
}
