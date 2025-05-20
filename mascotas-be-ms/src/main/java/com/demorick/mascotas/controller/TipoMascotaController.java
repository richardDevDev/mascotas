package com.demorick.mascotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demorick.mascotas.model.TipoMascota;
import com.demorick.mascotas.service.TipoMascotaService;

@RestController
@RequestMapping("/api/tipomascotas")
public class TipoMascotaController {

    @Autowired
    private TipoMascotaService mascotaService;

    @GetMapping
    public List<TipoMascota> getAllMascotas() {
        return mascotaService.getAllMascotas();
    }

}
