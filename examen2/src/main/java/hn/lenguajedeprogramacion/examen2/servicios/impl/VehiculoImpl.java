package hn.lenguajedeprogramacion.examen2.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajedeprogramacion.examen2.modelos.Vehiculos;
import hn.lenguajedeprogramacion.examen2.repositorio.VehiculosRepository;
import hn.lenguajedeprogramacion.examen2.servicios.VehiculoServicios;

@Service
public class VehiculoImpl implements VehiculoServicios{

    @Autowired
    private VehiculosRepository vehiculosRepository;

    @Override
    public Vehiculos crearVehiculos(Vehiculos nvoVehiculos) {
        Vehiculos vehiculoscreado = vehiculosRepository.save(nvoVehiculos);
        return vehiculoscreado;
    }

    @Override
    public List<Vehiculos> obtenerTodosLosVehiculos() {
       return this.vehiculosRepository.findAll();
    }

    @Override
    public Vehiculos obtenerporIdVehiculos(Integer idVehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerporIdVehiculos'");
    }
    
}
