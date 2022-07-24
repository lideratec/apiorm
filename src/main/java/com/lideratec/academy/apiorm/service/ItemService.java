package com.lideratec.academy.apiorm.service;

import java.util.List;

import com.lideratec.academy.apiorm.model.Item;

public interface ItemService {

	List<Item> listar();
	Item obtener(Integer id);
	void guardar(Item item);
	void eliminar(Integer id);
	void actualizar(Item item);
}
