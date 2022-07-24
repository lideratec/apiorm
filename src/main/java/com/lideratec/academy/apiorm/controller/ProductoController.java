package com.lideratec.academy.apiorm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lideratec.academy.apiorm.model.Producto;
import com.lideratec.academy.apiorm.service.ProductoService;

@RestController
@RequestMapping("/producto/v1")
public class ProductoController {
	
	@Autowired
	private ProductoService service;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Producto>> listar(){
		
		return new ResponseEntity<>(service.listar(), HttpStatus.OK);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Producto p){
		service.guardar(p);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Void> actualizar(@RequestBody Producto p){
		Producto producto = service.obtener(p.getIdProducto());
		if(producto != null) {
			service.actualizar(p);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		Producto producto = service.obtener(id);
		if(producto != null) {
			service.eliminar(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/obtener/{id}")
	public ResponseEntity<Producto> obtener(@PathVariable Integer id){
		Producto producto = service.obtener(id);
		if(producto != null) {
			return new ResponseEntity<>(producto, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	

}
