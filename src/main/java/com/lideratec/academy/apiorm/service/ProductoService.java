package com.lideratec.academy.apiorm.service;

import java.util.List;

import com.lideratec.academy.apiorm.model.Producto;

public interface ProductoService {

	List<Producto> listar();
	Producto obtener(Integer id);
	void guardar(Producto producto);
	void eliminar(Integer id);
	void actualizar(Producto producto);
}
