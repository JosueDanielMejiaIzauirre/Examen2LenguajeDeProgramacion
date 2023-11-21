package hn.lenguajedeprogramacion.examen2.modelos;

import org.hibernate.annotations.ForeignKey;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vehiculo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehiculos {
    
    @Id
    private int idVehiculo;

    private String marca;

    private int anio;

    private boolean disponible;

    @ForeignKey(name = "idTipoVehiculo")
    private int idTipoVehiculo;
}
