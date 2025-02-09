package com.ads.web.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Factura")
public class Factura {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

}
