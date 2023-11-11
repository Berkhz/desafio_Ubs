package com.ubsdigital.source.models.domain.user;

import jakarta.persistence.*;

@Entity
@Table(name = "login")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUsuario;
    private String username;
    private String senhaHash;

    public Usuario(int idUsuario, String username, String senhaHash) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.senhaHash = senhaHash;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenhaHash() {
        return senhaHash;
    }

    public void setSenhaHash(String senhaHash) {
        this.senhaHash = senhaHash;
    }
}
