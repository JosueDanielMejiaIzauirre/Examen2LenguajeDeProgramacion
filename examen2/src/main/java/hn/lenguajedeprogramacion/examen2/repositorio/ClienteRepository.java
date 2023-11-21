package hn.lenguajedeprogramacion.examen2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajedeprogramacion.examen2.modelos.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
}
