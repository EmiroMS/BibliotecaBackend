package com.proyecto.integrador.biblionetbackend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLibro;

    private String titulo;

    private String autor;

    private String categoria;

    private Integer disponibles;

    @ManyToOne
    @JoinColumn(name = "idBiblioteca")
    private Biblioteca biblioteca;

    // Getters y setters omitidos para mayor claridad

}

