package com.example.CRUDLodelcorder.service;

import com.example.CRUDLodelcorder.entities.Empanada;
import com.example.CRUDLodelcorder.entities.Sanguche;

import java.util.List;

public interface SangucheService {
    List<Sanguche> findAll();

    Sanguche addNew(Sanguche sanguche);
    void deleteforId(Long id);
    Sanguche findForId( Long id);

    Sanguche updateForId(Long id, Sanguche sanguche);



}
