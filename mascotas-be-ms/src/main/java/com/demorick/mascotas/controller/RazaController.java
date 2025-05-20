package com.demorick.mascotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demorick.mascotas.model.Raza;
import com.demorick.mascotas.service.RazaService;

@RestController
@RequestMapping("/api/razas")
public class RazaController {

    @Autowired
    private RazaService razaService;

    @GetMapping
    public List<Raza> getAllRazas() {
        return razaService.getAllRazas();
    }
}
