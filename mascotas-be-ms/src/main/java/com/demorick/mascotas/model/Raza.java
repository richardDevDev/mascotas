package com.demorick.mascotas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "raza")
public class Raza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_raza")
    private Long id;

    @Column(name = "raza", nullable = false)
    private String raza;
 

    // Constructor vacío para JPA
    public Raza() {
    }

    // Constructor con campos
    public Raza(Long id, String nombre, int razaId, int edad, int tipoMascotaId, int peso) {
        this.id = id;
        this.raza = nombre;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
