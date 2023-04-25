package com.proyecto.integrador.biblionetbackend.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "biblioteca")
public class Biblioteca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBiblioteca;

    private String nombre;

    private String direccion;

    private String telefono;

    private String horario;

    // // Getters y setters implementado con Lombok

}
