package co.edu.uceva.countryservice.model.service;

import co.edu.uceva.countryservice.model.dao.CelularDao;
import co.edu.uceva.countryservice.model.entities.Celular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CelularServiceImpl implements ICelularService {
    @Autowired
    private CelularDao celularDao;

    @Override
    public List<Celular> listar() {
        return (List<Celular>) celularDao.findAll();
    }

    @Override
    public void delete(Celular celular) {
        celularDao.delete(celular);
    }

    @Override
    public Celular save(Celular celular) {
        return celularDao.save(celular);
    }

    @Override
    public Celular findById(Long id) {
        return celularDao.findById(id).orElse(null);
    }

    @Override
    public Celular update(Celular celular) {
        return celularDao.save(celular);
    }
}
