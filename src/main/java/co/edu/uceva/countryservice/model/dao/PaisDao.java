package co.edu.uceva.countryservice.model.dao;


import co.edu.uceva.countryservice.model.entities.Pais;
import org.springframework.data.repository.CrudRepository;

// DAO: Data Access Object: Manejar las operaciones CRUD de la entidad

/**
 * Esta interfaz hereda de CrudRepository y se encarga de realizar las operaciones CRUD de la entidad Pais
 */
public interface PaisDao extends CrudRepository<Pais, Long> {
}
