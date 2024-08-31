package co.edu.uceva.countryservice.model.service;

import co.edu.uceva.countryservice.model.dao.PaisDao;
import co.edu.uceva.countryservice.model.entities.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Esta clase implementa los metodos de la interfaz IPaisService y se encarga de realizar
 * las operaciones CRUD de la entidad Pais
 */
@Service
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

    /**
     * Este metodo se encarga de eliminar un pais
     * @param pais pais a eliminar
     */
    @Override
    public void delete(Pais pais) {
        paisDao.delete(pais);
    }

    /**
     * Este metodo se encarga de guardar un pais
     * @param pais pais a guardar
     * @return retorna el objeto pais guardado incluyendo el id
     */
    @Override
    public Pais save(Pais pais) {
        return paisDao.save(pais);
    }

    /**
     * Este metodo se encarga de buscar un pais por su id
     * @param id id del pais a buscar
     * @return retorna un pais por su id
     */
    @Override
    public Pais findById(Long id) {
        return paisDao.findById(id).orElse(null);
    }

    /**
     * Este metodo se encarga de actualizar un pais
     * @param pais pais a actualizar
     * @return retorna el objeto pais actualizado
     */
    @Override
    public Pais update(Pais pais) {
        return paisDao.save(pais);
    }
}
