package com.demorick.mascotas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_mascota")
public class TipoMascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo")
    private Long id;

    @Column(name = "tipo", nullable = false)
    private String tipo;
 
    // Constructor vacío para JPA
    public TipoMascota() {
    }

    // Constructor con campos
    public TipoMascota(Long id, String tipo) {
        this.id = id;
        this.tipo = tipo;
        
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }
 
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
