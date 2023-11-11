package com.ubsdigital.source.controllers;

import com.ubsdigital.source.models.domain.Paciente;
import com.ubsdigital.source.models.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping
    public List<Paciente> all() {
        return pacienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Paciente getById(@PathVariable Long id) {
        return pacienteRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Paciente create(@RequestBody Paciente novo) {
        return pacienteRepository.save(novo);
    }

    @PutMapping("/{id}")
    public Paciente update(@PathVariable Long id, @RequestBody Paciente atualizado) {
        Paciente pacienteExistente = pacienteRepository.findById(id).orElse(null);
        if (pacienteExistente != null) {
            // Atualiza os campos necessários
            pacienteExistente.setNomePaciente(atualizado.getNomePaciente());
            pacienteExistente.setIdade(atualizado.getIdade());
            // Adicione outros campos conforme necessário

            return pacienteRepository.save(pacienteExistente);
        } else {
            return null; // Trate a lógica de erro conforme necessário
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        pacienteRepository.deleteById(id);
    }
}
