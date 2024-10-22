package com.practica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.models.Cliente;
import com.practica.service.ICliente;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ICliente clienteService;
	
	@PostMapping
	public Cliente guardarCliente(@RequestBody Cliente cliente) {
		return clienteService.guardarCliente(cliente);
	}
	
	@GetMapping("/{id}")
	public Cliente obtenerClientePorId(@PathVariable Long id) {
		return clienteService.obtenerClientePorId(id);
	}
	
	@GetMapping("/listar")
	public List<Cliente> listarClientes(){
		return clienteService.obtenerClientes();
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCliente(@PathVariable Long id) {
		clienteService.eliminarCliente(id);
	}
	
	@PutMapping(value = "/{id}")
	public Cliente actualizarCliente(@RequestBody Cliente cliente,@PathVariable("id") Long id) {
		cliente.setId(id);
		return clienteService.actualizarCliente(cliente);
	}
}
