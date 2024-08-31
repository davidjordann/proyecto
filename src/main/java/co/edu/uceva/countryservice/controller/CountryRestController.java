package co.edu.uceva.countryservice.controller;

import co.edu.uceva.countryservice.model.entities.Pais;
import co.edu.uceva.countryservice.model.service.PaisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Esta clase es el controlador de la entidad Pais y se mapea con la url /api/v1/country-service
 * y se encarga de exponer los servicios rest de la entidad Pais para realizar las operaciones CRUD
 * de la entidad Pais. Se encarga de recibir las peticiones http y retornar las respuestas http.
 */
@RestController
@RequestMapping("/api/v1/country-service")
public class CountryRestController {

    @Autowired
    private PaisServiceImpl paisService; // Inyecto el servicio de la entidad Pais para realizar las operaciones CRUD

    /**
     * Este metodo se encarga de retornar una lista de todos los paises
     * @return retorna una lista de todos los paises
     */
    @GetMapping("/paises")
    public List<Pais> listar() {
        return this.paisService.listar();
    }

    /**
     * Este metodo se encarga de retornar un pais por su id y se mapea con la url /api/pais-service/paises/{id}
     * @param id es el id del pais a buscar
     * @return retorna un pais por su id
     */
    @GetMapping("/paises/{id}")
    public Pais buscarPais(@PathVariable Long id) {
        return this.paisService.findById(id);
    }

    /**
     * Este metodo guarda un pais y me retorna el objeto de tipo Pais ya guardado con su id asignado
     * @param pais es el objeto de tipo Pais a guardar (sin el id)
     * @return retorna el objeto de tipo Pais guardado con su id asignado
     */
    @PostMapping("/pais")
    public Pais guardarPais(@RequestBody Pais pais) {
        return this.paisService.save(pais);
    }

    /**
     * Este metodo actualiza un pais y me retorna el objeto de tipo Pais ya actualizado
     * @param pais es el objeto de tipo Pais a actualizar (con el id)
     * @return retorna el objeto de tipo Pais actualizado
     */
    @PutMapping("/pais")
    public Pais actualizarPais(@RequestBody Pais pais) {
        return this.paisService.save(pais);
    }

    /**
     * Este metodo elimina un pais por su id
     * @param id es el id del pais a eliminar
     */
    @DeleteMapping("/paises/{id}")
    public void eliminarPais(@PathVariable Long id) {
        Pais pais = this.paisService.findById(id); // Encuentro un pais por su id
        this.paisService.delete(pais);
    }

}
