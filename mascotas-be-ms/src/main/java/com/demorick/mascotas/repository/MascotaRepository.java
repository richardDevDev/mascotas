package com.demorick.mascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demorick.mascotas.model.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {
    // Aquí puedes definir consultas personalizadas si quieres
}

