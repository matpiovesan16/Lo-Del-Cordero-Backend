package com.example.CRUDLodelcorder.repository;

import com.example.CRUDLodelcorder.entities.Sanguche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SancgucheRepository extends JpaRepository <Sanguche, Long> {
}
