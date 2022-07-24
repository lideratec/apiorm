package com.lideratec.academy.apiorm.service;

import java.util.List;

import com.lideratec.academy.apiorm.model.Proveedor;

public interface ProveedorService {

	List<Proveedor> listar();
	Proveedor obtener(Integer id);
	void guardar(Proveedor proveedor);
	void eliminar(Integer id);
	void actualizar(Proveedor proveedor);
}
