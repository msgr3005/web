package com.ads.web.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Operador {
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private Long DNI;
    private int codigo;

    
}
