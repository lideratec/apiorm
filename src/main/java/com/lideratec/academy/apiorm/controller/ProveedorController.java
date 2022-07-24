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

import com.lideratec.academy.apiorm.model.Proveedor;
import com.lideratec.academy.apiorm.service.ProveedorService;

@RestController
@RequestMapping("/proveedor/v1")
public class ProveedorController {
	
	@Autowired
	private ProveedorService service;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Proveedor>> listar(){
		
		return new ResponseEntity<>(service.listar(), HttpStatus.OK);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Proveedor p){
		service.guardar(p);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Void> actualizar(@RequestBody Proveedor p){
		Proveedor objeto = service.obtener(p.getIdProveedor());
		if(objeto != null) {
			service.actualizar(p);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		Proveedor objeto = service.obtener(id);
		if(objeto != null) {
			service.eliminar(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/obtener/{id}")
	public ResponseEntity<Proveedor> obtener(@PathVariable Integer id){
		Proveedor objeto = service.obtener(id);
		if(objeto != null) {
			return new ResponseEntity<>(objeto, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	


}
