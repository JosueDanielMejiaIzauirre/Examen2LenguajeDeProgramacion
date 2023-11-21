package hn.lenguajedeprogramacion.examen2.modelos;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Cliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    
    @Id
    private int codigoCliente;

    private String nombre;

    private String apellido;

    private Date fechaIngreso;

    private int idTipoCliente;

}
