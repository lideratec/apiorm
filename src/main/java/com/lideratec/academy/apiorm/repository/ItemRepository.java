package com.lideratec.academy.apiorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lideratec.academy.apiorm.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
