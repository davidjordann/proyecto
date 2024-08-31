package co.edu.uceva.countryservice.model.service;


import co.edu.uceva.countryservice.model.entities.Pais;

import java.util.List;

public interface IPaisService {
    List<Pais> listar();
    void delete(Pais pais); //Elimina un pais de la base de datos
    Pais save(Pais pais); //Guarda un pais y me retorna un objeto de tipo Pais
    Pais findById(Long id); //Busca un pais por su id y me retorna un objeto de tipo Pais
    Pais update(Pais pais); //Actualiza un pais y me retorna un objeto de tipo Pais
}
