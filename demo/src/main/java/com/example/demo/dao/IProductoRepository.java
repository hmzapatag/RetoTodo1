package com.example.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Producto;

public interface IProductoRepository extends CrudRepository<Producto, Integer>{

	@Query("SELECT prd FROM Producto prd WHERE prd.idProducto = :idProducto")
	Producto findByIdProducto(@Param("idProducto") Integer idProducto);
	
}
