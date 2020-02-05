package com.example.demo.service;

import com.example.demo.model.Producto;

public interface IProductoService {

	public Producto buscarProducto(Integer idProducto);
	
	public Producto crearProducto(Producto producto);
	
	public Producto actualizarProducto(Producto producto);
	
	public void eliminarProducto(Integer idProducto);
	
}
