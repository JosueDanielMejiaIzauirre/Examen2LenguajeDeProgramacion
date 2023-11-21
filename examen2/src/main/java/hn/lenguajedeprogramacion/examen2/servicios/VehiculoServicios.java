package hn.lenguajedeprogramacion.examen2.servicios;

import java.util.List;

import hn.lenguajedeprogramacion.examen2.modelos.Vehiculos;

public interface VehiculoServicios {
    
    public Vehiculos crearVehiculos(Vehiculos vehiculos);

    public List<Vehiculos> obtenerTodosLosVehiculos();

    public Vehiculos obtenerporIdVehiculos(Integer idVehiculo);

}
