package com.demorick.mascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demorick.mascotas.model.TipoMascota;

@Repository
public interface TipoMascotaRepository extends JpaRepository<TipoMascota, Long> {
    // Aquí puedes definir consultas personalizadas si quieres
}

