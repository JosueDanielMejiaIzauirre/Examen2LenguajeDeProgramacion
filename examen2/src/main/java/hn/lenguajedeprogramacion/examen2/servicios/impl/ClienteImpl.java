package hn.lenguajedeprogramacion.examen2.servicios.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import hn.lenguajedeprogramacion.examen2.modelos.Cliente;
import hn.lenguajedeprogramacion.examen2.repositorio.ClienteRepository;
import hn.lenguajedeprogramacion.examen2.servicios.ClienteServicios;

@Service
public class ClienteImpl implements ClienteServicios{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente nvoCliente) {
        Cliente clientecreado = clienteRepository.save(nvoCliente);
        return clientecreado;
    }

    @Override
    public List<Cliente> obtenerTodosLosCliente() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerClientePorId(Integer idCliente) {
        return null;
        //
    }

}
