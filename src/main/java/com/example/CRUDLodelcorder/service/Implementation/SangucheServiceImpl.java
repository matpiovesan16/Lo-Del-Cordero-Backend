package com.example.CRUDLodelcorder.service.Implementation;

import com.example.CRUDLodelcorder.entities.Empanada;
import com.example.CRUDLodelcorder.entities.Sanguche;
import com.example.CRUDLodelcorder.repository.SancgucheRepository;
import com.example.CRUDLodelcorder.service.SangucheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
public class SangucheServiceImpl implements SangucheService {
    @Autowired
    private SancgucheRepository sancgucheRepository;

    @Override
    @CrossOrigin("http://localhost:3000")
    public List<Sanguche> findAll() {
        return sancgucheRepository.findAll();
    }

    @Override
    public Sanguche addNew(Sanguche sanguche) {
        return  sancgucheRepository.save(sanguche);
    }

    @Override
    public void deleteforId(Long id) {
        sancgucheRepository.deleteById(id);

    }

    @Override
    public Sanguche findForId(Long id) {
        return sancgucheRepository.findById(id).orElse(null);
    }

    @Override
    public Sanguche updateForId(Long id, Sanguche sanguche) {
        Sanguche sangucheUpdate = sancgucheRepository.findById(id).orElse(null);
        if(!sangucheUpdate.equals(null)){
            sangucheUpdate.setNombre(sanguche.getNombre());
            sangucheUpdate.setDescripcion(sanguche.getDescripcion());
            sangucheUpdate.setPrecio(sanguche.getPrecio());
            sangucheUpdate.setTipo(sanguche.getTipo());
            return sancgucheRepository.save(sangucheUpdate);
        }

        return null;

    }
}
