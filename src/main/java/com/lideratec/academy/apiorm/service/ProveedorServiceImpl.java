package com.lideratec.academy.apiorm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lideratec.academy.apiorm.model.Proveedor;
import com.lideratec.academy.apiorm.repository.ProveedorRepository;

@Service
public class ProveedorServiceImpl implements ProveedorService {

	@Autowired
	private ProveedorRepository repository;
	
	@Override
	public List<Proveedor> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Proveedor obtener(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Proveedor proveedor) {
		// TODO Auto-generated method stub
		repository.save(proveedor);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void actualizar(Proveedor proveedor) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(proveedor);
	}

}
