package hn.lenguajedeprogramacion.examen2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajedeprogramacion.examen2.modelos.TipoVehiculos;

public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculos, Integer>{
    
}
