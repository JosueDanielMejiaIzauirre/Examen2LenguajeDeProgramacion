package hn.lenguajedeprogramacion.examen2.servicios;


import java.util.List;

import hn.lenguajedeprogramacion.examen2.modelos.Cliente;

public interface ClienteServicios {
    
    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerTodosLosCliente();

    public Cliente obtenerClientePorId(Integer idCliente);
}
