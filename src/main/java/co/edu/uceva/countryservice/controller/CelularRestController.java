package co.edu.uceva.countryservice.controller;

import co.edu.uceva.countryservice.model.entities.Celular;
import co.edu.uceva.countryservice.model.service.CelularServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * profe aqui en esta clase esta la ent celular y se mapea con la URL /api/v1/celular-service
 * esti mismo se encarga de exponer los servicios REST de la entidad Celular para realizar las operaciones CRUD.
 * y posterior a rodo las peticiones HTTP y retorna las respuestas HTTP.
 */
@RestController
@RequestMapping("/api/v1/celular-service")
public class CelularRestController {

    @Autowired
    private CelularServiceImpl celularService; // Inyecto el servicio de la entidad Celular para realizar las operaciones CRUD

    /**
     * aqui en ewte metodo se encarga de retornar una lista de todos los celulares.
     * @return retorna una lista de todos los celulares.
     */
    @GetMapping("/celulares")
    public List<Celular> listar() {
        return this.celularService.listar();
    }

    /**
     * aqui en este método se encarga de retornar un celular por su id.
     * @param id es el id del celular a buscar.
     * @return retorna un celular por su id.
     */
    @GetMapping("/celulares/{id}")
    public Celular buscarCelular(@PathVariable Long id) {
        return this.celularService.findById(id);
    }

    /**
     * aqui es este método guarda un celular y retorna el objeto Celular ya guardado con su id asignado.
     * @param celular es el objeto Celular a guardar (sin el id).
     * @return retorna el objeto Celular guardado con su id asignado.
     */
    @PostMapping("/celular")
    public Celular guardarCelular(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    /**
     * aqui en este método actualiza un celular y retorna el objeto Celular ya actualizado.
     * @param celular es el objeto Celular a actualizar (con el id).
     * @return retorna el objeto Celular actualizado.
     */
    @PutMapping("/celular")
    public Celular actualizarCelular(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    /**
     * aqui en este método elimina un celular por su id.
     * @param id es el id del celular a eliminar.
     */
    @DeleteMapping("/celulares/{id}")
    public void eliminarCelular(@PathVariable Long id) {
        Celular celular = this.celularService.findById(id); // Encuentra un celular por su id
        if (celular != null) {
            this.celularService.delete(celular);
        }
    }
}
