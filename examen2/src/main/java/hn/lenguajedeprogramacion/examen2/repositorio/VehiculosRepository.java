package hn.lenguajedeprogramacion.examen2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajedeprogramacion.examen2.modelos.Vehiculos;

public interface VehiculosRepository extends JpaRepository<Vehiculos, Integer>{
    
}
