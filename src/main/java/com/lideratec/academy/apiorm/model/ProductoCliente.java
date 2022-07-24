package com.lideratec.academy.apiorm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto_cliente")
public class ProductoCliente {
	
	@Id
	private ProductoClienteFK fk = new ProductoClienteFK();
	
	private Integer cantidad;
	

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	

}

@Embeddable
class ProductoClienteFK implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5295853340260696269L;


	@Column(name = "id_producto", nullable = false, unique = true)
	private Integer idProducto;
	
	
	@Column(name = "id_cliente", nullable = false, unique = true)
	private Integer idCliente;


	public Integer getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}


	public Integer getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	
	
	
}