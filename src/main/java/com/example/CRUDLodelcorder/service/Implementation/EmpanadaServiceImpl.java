package com.example.CRUDLodelcorder.service.Implementation;

import com.example.CRUDLodelcorder.entities.Empanada;
import com.example.CRUDLodelcorder.repository.EmpanadaRepository;
import com.example.CRUDLodelcorder.service.EmpanadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@Service
public class EmpanadaServiceImpl implements EmpanadaService {

    @Autowired
    EmpanadaRepository empanadaRepository;
    @Override  @CrossOrigin("http://localhost:3000")
    public List<Empanada> findAll() {
        return empanadaRepository.findAll();
    }

    @Override
    public Empanada addNew(Empanada empanada) {
        return empanadaRepository.save(empanada);
    }

    @Override
    public void deleteforId(Long id) {
        empanadaRepository.deleteById(id);
    }

    @Override
    public Empanada findForId(Long id) {
        return empanadaRepository.findById(id).orElse(null);
    }

    @Override
    public Empanada updateForId(Long id, Empanada empanada) {
        Empanada empanadaUpdate = empanadaRepository.findById(id).orElse(null);
        if(!empanadaUpdate.equals(null)){
            empanadaUpdate.setNombre(empanada.getNombre());
            empanadaUpdate.setDescripcion(empanada.getDescripcion());
            empanadaUpdate.setPrecio(empanada.getPrecio());
            return empanadaRepository.save(empanadaUpdate);
        }

        return null;
    }


}
