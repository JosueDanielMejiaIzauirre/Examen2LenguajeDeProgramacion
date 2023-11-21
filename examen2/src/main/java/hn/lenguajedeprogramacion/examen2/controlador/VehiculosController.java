package hn.lenguajedeprogramacion.examen2.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.lenguajedeprogramacion.examen2.modelos.Cliente;
import hn.lenguajedeprogramacion.examen2.modelos.Vehiculos;

@RestController
@RequestMapping("/api/vehiculo")
public class VehiculosController {

    @PostMapping("/crear")
    public Vehiculos crearVehiculos(@RequestBody Vehiculos nvoVehiculos){
        return nvoVehiculos;
    }

    @GetMapping("/obtener/todos")
    public List<Vehiculos> obtenerTodos(){
        return this.VehiculoImpl.obtenerTodosLosCliente();
    }
        
    
}
