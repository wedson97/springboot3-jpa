package com.wedson.aula.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wedson.aula.entities.Pedido;
import com.wedson.aula.services.PedidoService;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	
	private PedidoService service;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> findAll(){
		List<Pedido> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Pedido> findById(@PathVariable Long id){
		Pedido obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
