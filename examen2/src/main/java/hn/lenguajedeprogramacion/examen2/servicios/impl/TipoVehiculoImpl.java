package hn.lenguajedeprogramacion.examen2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajedeprogramacion.examen2.modelos.TipoVehiculos;
import hn.lenguajedeprogramacion.examen2.modelos.Vehiculos;
import hn.lenguajedeprogramacion.examen2.repositorio.TipoVehiculoRepository;
import hn.lenguajedeprogramacion.examen2.servicios.TipoVehiculosServicios;

@Service
public class TipoVehiculoImpl implements TipoVehiculosServicios{

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculos crearTipoVehiculos(TipoVehiculos nvoTipoVehiculos) {
        TipoVehiculos tipovehiculoscreado = tipoVehiculoRepository.save(nvoTipoVehiculos);
        return tipovehiculoscreado;
    }

    
    
}
