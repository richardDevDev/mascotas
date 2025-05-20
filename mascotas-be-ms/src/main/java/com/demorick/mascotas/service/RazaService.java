package com.demorick.mascotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demorick.mascotas.model.Raza;
import com.demorick.mascotas.repository.RazaRepository;

@Service
public class RazaService {

    @Autowired
    private RazaRepository razaRepository;

    public List<Raza> getAllRazas() {
        return razaRepository.findAll();
    }

    
 
    // Métodos extra para agregar, eliminar, etc.
}

