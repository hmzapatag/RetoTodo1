package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.data.Request;
import com.example.demo.api.data.Response;
import com.example.demo.service.IProductoService;

@RestController
@RequestMapping(value = "/api/producto")
public class RestProducto {

	private static final String TRANSACCION_EXITOSA = "Transaccion Exitosa";
	
	@Autowired
	private IProductoService iProductoService;

	@GetMapping(path = "/{id}")
	public Response buscarProducto(@PathVariable(name = "id") Integer idProducto) {
		Response response = new Response();
		response.setProducto(iProductoService.buscarProducto(idProducto));
		response.setMensage(TRANSACCION_EXITOSA);
		return response;
	}
	
	@PostMapping
	public Response crearProducto(@RequestBody Request request) {
		Response response = new Response();
		response.setProducto(iProductoService.crearProducto(request.getProducto()));
		response.setMensage(TRANSACCION_EXITOSA);
		return response;
	}
	
	@PutMapping
	public Response actualizarProducto(@RequestBody Request request) {
		Response response = new Response();
		response.setProducto(iProductoService.actualizarProducto(request.getProducto()));
		response.setMensage(TRANSACCION_EXITOSA);
		return response;
	}
	
	@DeleteMapping(name = "/{id}")
	public Response eliminarProducto(@PathVariable(name = "id") Integer idProducto) {
		Response response = new Response();
		iProductoService.eliminarProducto(idProducto);
		response.setMensage(TRANSACCION_EXITOSA);
		return response;
	}
	

}
