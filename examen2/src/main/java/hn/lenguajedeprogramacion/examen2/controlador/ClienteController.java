package hn.lenguajedeprogramacion.examen2.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.lenguajedeprogramacion.examen2.modelos.Cliente;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente nvoCliente){
        return nvoCliente;
    }

    @GetMapping("/obtener/todos")
    public List<Cliente> obtenerTodos(){
        return this.ClienteImpl.obtenerTodosLosCliente();
    }
        
}
