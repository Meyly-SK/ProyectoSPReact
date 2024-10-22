package com.practica.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.models.Cliente;
import com.practica.repository.ClienteRepository;
import com.practica.service.ICliente;

@Service
public class ClienteServiceImpl implements ICliente {

	@Autowired
	private ClienteRepository clienterepo;
	
	@Override
	public Cliente guardarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienterepo.save(cliente);
	}

	@Override
	public Cliente obtenerClientePorId(Long id) {
		// TODO Auto-generated method stub
		return clienterepo.findById(id).orElse(null);
	}

	@Override
	public List<Cliente> obtenerClientes() {
		// TODO Auto-generated method stub
		return clienterepo.findAll();
	}

	@Override
	public void eliminarCliente(Long id) {
		// TODO Auto-generated method stub
		clienterepo.deleteById(id);
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		try {
			Cliente guardarCliente = this.clienterepo.save(cliente);
			return guardarCliente;
		}catch(Exception e) {
			throw e;
		}
	}

}
