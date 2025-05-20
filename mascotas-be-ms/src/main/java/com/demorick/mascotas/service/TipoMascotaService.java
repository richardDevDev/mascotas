package com.demorick.mascotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demorick.mascotas.model.TipoMascota;
import com.demorick.mascotas.repository.TipoMascotaRepository;

@Service
public class TipoMascotaService {

    @Autowired
    private TipoMascotaRepository mascotaRepository;

    public List<TipoMascota> getAllMascotas() {
        return mascotaRepository.findAll();
    }
}

