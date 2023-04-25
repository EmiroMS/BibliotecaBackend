package com.proyecto.integrador.biblionetbackend.models;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;

    private String nombre;

    private String correo;

    private String contrasena;

    // Getters y setters implementado con Lombok

}

