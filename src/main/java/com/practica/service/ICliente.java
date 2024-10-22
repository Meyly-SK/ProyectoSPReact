package com.practica.service;

import java.util.List;

import com.practica.models.Cliente;

public interface ICliente {
	
	public Cliente guardarCliente(Cliente cliente);
	public Cliente obtenerClientePorId(Long id);
	public List<Cliente> obtenerClientes();
	public void eliminarCliente(Long id);
	public Cliente actualizarCliente(Cliente cliente);

}
