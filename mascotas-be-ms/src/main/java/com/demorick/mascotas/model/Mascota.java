package com.demorick.mascotas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mascota")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mascota_id")
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "raza_id", nullable = false)
    private int razaId;

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "tipo_mascota_id", nullable = false)
    private int tipoMascotaId;

    @Column(name = "peso", nullable = true)
    private int peso;

    @Column(name = "vacunado", nullable = true)
    private int vacunado;

    // Constructor vacío para JPA
    public Mascota() {
    }

    // Constructor con campos
    public Mascota(Long id, String nombre, int razaId, int edad, int tipoMascotaId, int peso) {
        this.id = id;
        this.nombre = nombre;
        this.razaId = razaId;
        this.edad = edad;
        this.tipoMascotaId = tipoMascotaId;
        this.peso = peso;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRazaId() {
        return razaId;
    }

    public void setRazaId(int razaId) {
        this.razaId = razaId;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTipoMascotaId() {
        return tipoMascotaId;
    }

    public void setTipoMascotaId(int tipoMascotaId) {
        this.tipoMascotaId = tipoMascotaId;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVacunado() {
        return vacunado;
    }

    public void setVacunado(int vacunado) {
        this.vacunado = vacunado;
    }
}
