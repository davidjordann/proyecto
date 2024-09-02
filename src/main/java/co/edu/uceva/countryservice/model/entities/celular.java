package co.edu.uceva.countryservice.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Celular {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;
    private String imei;
    private String marca;
    private String modelo;
    private String ram;
    private String memoria;
    private String bateria;
    private String camara;
    private String sistemaOperativo;
}
