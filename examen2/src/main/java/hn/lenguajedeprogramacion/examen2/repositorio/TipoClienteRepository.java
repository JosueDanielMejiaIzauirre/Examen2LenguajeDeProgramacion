package hn.lenguajedeprogramacion.examen2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajedeprogramacion.examen2.modelos.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer>{
    
}
