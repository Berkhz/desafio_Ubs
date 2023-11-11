package com.ubsdigital.source.controllers;

import com.ubsdigital.source.models.domain.Medico;
import com.ubsdigital.source.models.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @GetMapping
    public List<Medico> all() {
        return medicoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Medico getById(@PathVariable Long id) {
        return medicoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Medico create(@RequestBody Medico novo) {
        return medicoRepository.save(novo);
    }

    @PutMapping("/{id}")
    public Medico update(@PathVariable Long id, @RequestBody Medico atualizado) {
        Medico medicoExistente = medicoRepository.findById(id).orElse(null);
        if (medicoExistente != null) {
            // Atualiza os campos necessários
            medicoExistente.setNomeMedico(atualizado.getNomeMedico());
            // Adicione outros campos conforme necessário

            return medicoRepository.save(medicoExistente);
        } else {
            return null; // Trate a lógica de erro conforme necessário
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        medicoRepository.deleteById(id);
    }
}
