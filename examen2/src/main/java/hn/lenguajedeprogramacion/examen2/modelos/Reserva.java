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
@Table(name = "reserva")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {
    
    @Id
    private int idReserva;

    private int idCliente;

    private int idVehicul;

    private Date fecha;

    private int dias;

    private double total;

}
