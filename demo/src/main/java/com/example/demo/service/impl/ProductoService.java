package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProductoRepository;
import com.example.demo.model.Producto;
import com.example.demo.service.IProductoService;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	private IProductoRepository iProductoRepository;
	
	@Override
	public Producto buscarProducto(Integer idProducto) {
		return iProductoRepository.findByIdProducto(idProducto);
	}
	
	public Producto crearProducto(Producto producto) {
		return iProductoRepository.save(producto);
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		return iProductoRepository.save(producto);
	}

	@Override
	public void eliminarProducto(Integer idProducto) {
		iProductoRepository.deleteById(idProducto);
	}
	
	
}
