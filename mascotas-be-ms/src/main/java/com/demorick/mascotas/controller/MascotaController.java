package com.demorick.mascotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demorick.mascotas.model.Mascota;
import com.demorick.mascotas.service.MascotaService;

@RestController
@RequestMapping("/api/mascotas")
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    @GetMapping
    public List<Mascota> getAllMascotas() {
        return mascotaService.getAllMascotas();
    }

    @PostMapping("/create")
    public ResponseEntity<Mascota> crearMascota(@RequestBody Mascota mascota) {
        Mascota nueva = mascotaService.createMascota(mascota);
        return ResponseEntity.ok(nueva);
    }

    @PostMapping("/edit/{id}")
    public ResponseEntity<Mascota> editarMascota(@PathVariable Long id, @RequestBody Mascota mascota) {
        Mascota nueva = mascotaService.editarMascota(id,mascota);
        return ResponseEntity.ok(nueva);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> eliminarMascota(@PathVariable Long id) {
        mascotaService.eliminarMascotaPorId(id);
        return ResponseEntity.noContent().build();
    }

}
