package com.example.CRUDLodelcorder.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="sanguches")
public class Sanguche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio")
    private Double precio;
    @Column(name = "tipo")
    private String tipo;
}
