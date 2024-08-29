package co.edu.uceva.countryservice.controller;

import co.edu.uceva.countryservice.model.entities.Pais;
import co.edu.uceva.countryservice.model.service.PaisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/country-service")
public class CountryRestController {

    @Autowired
    private PaisServiceImpl paisService;

    @GetMapping("/paises")
    public List<Pais> listar() {
        return this.paisService.listar();
    }

}
