package com.example.CRUDLodelcorder.service;

import com.example.CRUDLodelcorder.entities.Empanada;

import java.util.List;

public interface EmpanadaService {
    List<Empanada> findAll();
    Empanada addNew(Empanada empanada);
    void deleteforId(Long id);
    Empanada findForId( Long id);

    Empanada updateForId(Long id, Empanada empanada);
}
