package com.ubsdigital.source.controllers;

import com.ubsdigital.source.models.domain.user.Usuario;
import com.ubsdigital.source.models.repository.user.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> all() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Usuario getById(@PathVariable Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario novo) {
        return usuarioRepository.save(novo);
    }

    @PutMapping("/{id}")
    public Usuario update(@PathVariable Long id, @RequestBody Usuario atualizado) {
        Usuario usuarioExistente = usuarioRepository.findById(id).orElse(null);
        if (usuarioExistente != null) {
            // Atualiza os campos necessários
            usuarioExistente.setUsername(atualizado.getUsername());
            usuarioExistente.setSenhaHash(atualizado.getSenhaHash());
            // Adicione outros campos conforme necessário

            return usuarioRepository.save(usuarioExistente);
        } else {
            return null; // Trate a lógica de erro conforme necessário
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
    }
}
