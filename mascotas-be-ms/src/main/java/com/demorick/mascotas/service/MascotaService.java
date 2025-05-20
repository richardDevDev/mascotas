package com.demorick.mascotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demorick.mascotas.model.Mascota;
import com.demorick.mascotas.repository.MascotaRepository;

@Service
public class MascotaService {

    @Autowired
    private MascotaRepository mascotaRepository;

    public List<Mascota> getAllMascotas() {
        return mascotaRepository.findAll();
    }

    public Mascota createMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    public Mascota editarMascota(Long id, Mascota mascotaActualizada) {
        Mascota existente = mascotaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mascota no encontrada con ID: " + id));

        // Actualizar los campos necesarios
        existente.setNombre(mascotaActualizada.getNombre());
        existente.setRazaId(mascotaActualizada.getRazaId());
        existente.setEdad(mascotaActualizada.getEdad());
        existente.setTipoMascotaId(mascotaActualizada.getTipoMascotaId());
        existente.setPeso(mascotaActualizada.getPeso());
        existente.setVacunado(mascotaActualizada.getVacunado());

        // Guardar y devolver la mascota actualizada
        return mascotaRepository.save(existente);
    }

    public void eliminarMascotaPorId(Long id) {
        mascotaRepository.deleteById(id);
    }
}
