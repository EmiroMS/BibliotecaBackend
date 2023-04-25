package com.proyecto.integrador.biblionetbackend.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Persona persona;

    // Getters y setters implementado con Lombok

}

