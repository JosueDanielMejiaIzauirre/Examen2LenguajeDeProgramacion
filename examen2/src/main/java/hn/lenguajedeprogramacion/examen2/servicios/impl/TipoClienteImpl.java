package hn.lenguajedeprogramacion.examen2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajedeprogramacion.examen2.modelos.TipoCliente;
import hn.lenguajedeprogramacion.examen2.repositorio.TipoClienteRepository;
import hn.lenguajedeprogramacion.examen2.servicios.TipoClienteServicios;

@Service
public class TipoClienteImpl implements TipoClienteServicios{

    @Autowired
    private TipoClienteRepository clienteRepository;

    @Override
    public TipoCliente crearTipoCliente(String descripcion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearTipoCliente'");
    }
    
}
