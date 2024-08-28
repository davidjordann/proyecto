package co.edu.uceva.countryservice.model.service;

import co.edu.uceva.countryservice.model.dao.PaisDao;
import co.edu.uceva.countryservice.model.entities.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Esta interfaz define los metodos que se van a implementar en la clase PaisServiceImpl
 */
@Component
public class PaisServiceImpl implements IPaisService {
    @Autowired
    PaisDao paisDao;
    /**
     * Este metodo se encarga de listar los paises
     * @return retorna una lista de paises
     */
    @Override
    public List<Pais> listar() {
        return (List<Pais>) paisDao.findAll();
    }
}
