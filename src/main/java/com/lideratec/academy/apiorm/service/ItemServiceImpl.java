package com.lideratec.academy.apiorm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lideratec.academy.apiorm.model.Item;
import com.lideratec.academy.apiorm.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository repository;
	
	@Override
	public List<Item> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Item obtener(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Item item) {
		// TODO Auto-generated method stub
		repository.save(item);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void actualizar(Item item) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(item);
	}

}
