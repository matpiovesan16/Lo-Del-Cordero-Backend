package com.example.CRUDLodelcorder.repository;

import com.example.CRUDLodelcorder.entities.Empanada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpanadaRepository  extends JpaRepository <Empanada, Long> {
}
