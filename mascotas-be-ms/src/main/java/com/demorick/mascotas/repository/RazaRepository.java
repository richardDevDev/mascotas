package com.demorick.mascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demorick.mascotas.model.Raza;

@Repository
public interface RazaRepository extends JpaRepository<Raza, Long> {
    // Aquí puedes definir consultas personalizadas si quieres
}

