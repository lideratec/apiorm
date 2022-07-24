package com.lideratec.academy.apiorm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lideratec.academy.apiorm.model.Producto;
import com.lideratec.academy.apiorm.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;
	
	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Producto obtener(Integer id) {
		// TODO Auto-generated method stub
		
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		repository.save(producto);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(producto);
	}

}
