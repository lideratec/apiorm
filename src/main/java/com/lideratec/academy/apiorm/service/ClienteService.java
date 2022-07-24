package com.lideratec.academy.apiorm.service;

import java.util.List;

import com.lideratec.academy.apiorm.model.Cliente;

public interface ClienteService {

	List<Cliente> listar();
	Cliente obtener(Integer id);
	void guardar(Cliente cliente);
	void eliminar(Integer id);
	void actualizar(Cliente cliente);
}
