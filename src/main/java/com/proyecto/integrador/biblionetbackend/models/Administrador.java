package com.proyecto.integrador.biblionetbackend.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "administrador")
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdministrador;

    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Persona persona;

    // Getters y setters implementado con Lombok
}
