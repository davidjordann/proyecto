package co.edu.uceva.countryservice.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * ORM: Object Relational Mapping
 * JPA: Java Persistence API (Especificación) -> Hibernate, EclipseLink, TopLink, OpenJPA, DataNucleus
 */


/**
 * La clase Pais es una entidad que se mapea con la tabla pais en la base de datos.
 */
@Data
@Entity
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String capital;
    private int poblacion;
    private String region;
}
