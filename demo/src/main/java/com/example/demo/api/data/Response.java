package com.example.demo.api.data;

import com.example.demo.model.Producto;

public class Response {

	private Producto producto;
	private String mensage;

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public String getMensage() {
		return mensage;
	}

	public void setMensage(String mensage) {
		this.mensage = mensage;
	}

}
