package com.example.CRUDLodelcorder.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "empanadas")
public class Empanada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
     @Column(name = "descripcion")
    private String descripcion;
     @Column(name = "precio")
    private Double precio;

}
