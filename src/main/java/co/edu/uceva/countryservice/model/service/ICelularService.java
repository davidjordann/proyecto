package co.edu.uceva.countryservice.model.service;

import co.edu.uceva.countryservice.model.entities.Celular;
import java.util.List;

public interface ICelularService {
    List<Celular> listar();
    void delete(Celular celular);
    Celular save(Celular celular);
    Celular findById(Long id);
    Celular update(Celular celular);
}
